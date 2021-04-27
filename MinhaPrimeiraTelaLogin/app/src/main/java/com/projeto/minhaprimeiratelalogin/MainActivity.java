package com.projeto.minhaprimeiratelalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmailLogar, editTextSenhaLogar;
    private Button btnEntrar;
    private TextView txtCdastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        txtCdastro = (TextView) findViewById(R.id.txtCadastro);

        txtCdastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abreCad = new Intent(MainActivity.this, MainCadastro.class);
                startActivity(abreCad);
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abreCad = new Intent(MainActivity.this, MainPrincipal.class);
                startActivity(abreCad);
            }
        });


    }
}
