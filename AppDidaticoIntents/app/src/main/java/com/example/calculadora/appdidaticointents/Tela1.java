package com.example.calculadora.appdidaticointents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {

    private EditText nomeEditText;
    private String saudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        this.nomeEditText = (EditText)findViewById(R.id.editTextNome);
    }
    public void surpreenderUsuario(View v){
        Editable texto = this.nomeEditText.getText();
        String saudacao = getResources().getString(R.string.saudacao);
        String msg = saudacao + " " + texto.toString();

        Intent i = new Intent(this,Tela2.class);
        i.putExtra("mensagem", msg);
        startActivity( i );
    }
}
