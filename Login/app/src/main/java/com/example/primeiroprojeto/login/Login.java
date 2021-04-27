package com.example.primeiroprojeto.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText editTextEmailLogar, editTextSenhaLogar;
    private Button btnEntrar;
    private TextView txtCdastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtCdastro = (TextView) findViewById(R.id.txtCadastro);

        txtCdastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abreCad = new Intent(Login.this, MainCadastro.class);
                startActivity(abreCad);
            }
        });

    }
}
