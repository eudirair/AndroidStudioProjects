package com.projeto.minhaprimeiratelalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class MainCadastro extends AppCompatActivity {

    private EditText editNomeCad, editEmailCad, editSenhaCad, editSenhaConf;
    private Button btnCadastrar;

    private String HOST = "http://10.0.0.105/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);

        editNomeCad = (EditText)findViewById(R.id.editNomeCad);
        editEmailCad = (EditText)findViewById(R.id.editEmailCad);
        editSenhaCad = (EditText)findViewById(R.id.editSenhaCad);
        editSenhaConf = (EditText)findViewById(R.id.editSenhaConf);

        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNomeCad.getText().toString();
                String email = editEmailCad.getText().toString();
                String senha = editSenhaCad.getText().toString();
                String confirma = editSenhaConf.getText().toString();

                String url = HOST + "/cadastro.php";

                if (confirma.equals(senha)){

                    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                        Toast.makeText(MainCadastro.this, "Todos os campos são obrigatorio ! " , Toast.LENGTH_LONG).show();
                    }

                    Ion.with(MainCadastro.this)
                            .load(url)
                            .setBodyParameter("nome",nome)
                            .setBodyParameter("email",email)
                            .setBodyParameter("senha",senha)
                            .asJsonObject()
                            .setCallback(new FutureCallback<JsonObject>() {
                                @Override
                                public void onCompleted(Exception e, JsonObject result) {

                                    try{
                                        /* Toast.makeText(MainCadastro.this, "Nome: " + result.get("NOME").getAsString(), Toast.LENGTH_LONG).show();*/
                                       /*Toast.makeText(MainCadastro.this, "Retorno: " + result.toString(), Toast.LENGTH_LONG).show();*/
                                        String SESSION = result.get("msg").getAsString();
                                        if (SESSION.equals("msg")){
                                            Toast.makeText(MainCadastro.this, "Este e-mail já está cadastrado", Toast.LENGTH_LONG).show();
                                        }else if(SESSION.equals("msgcad")){
                                            limpaCampos();
                                            Toast.makeText(MainCadastro.this, "Este e-mail já está cadastrado", Toast.LENGTH_LONG).show();
                                        }else {
                                            Toast.makeText(MainCadastro.this, "Ops! Ocorreu um erro ! ! ", Toast.LENGTH_LONG).show();
                                        }


                                    }catch(Exception erro){
                                        Toast.makeText(MainCadastro.this, "Ops! Ocorreu um erro inesperado, " + erro, Toast.LENGTH_LONG).show();
                                    }

                                }
                            });

                }else {
                    Toast.makeText(MainCadastro.this, "As senhas nao conferem ! " , Toast.LENGTH_LONG).show();
                }

               //String url = "http://192.168.43.192/login/teste.json";
                //String url = "http://10.0.0.105/login/teste.json";

            }

            public void limpaCampos(){
                editNomeCad.setText("");
                editEmailCad.setText("");
                editSenhaCad.setText("");
                editSenhaConf.setText("");
            }

        });

    }
}
