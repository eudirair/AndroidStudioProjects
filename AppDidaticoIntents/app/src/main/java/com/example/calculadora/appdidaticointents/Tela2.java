package com.example.calculadora.appdidaticointents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private TextView saudacaoTexteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        this.saudacaoTexteView = (TextView)findViewById(R.id.textViewMensagem);

        Intent i = getIntent();
        String msg = i.getStringExtra("mansagem");

        this.saudacaoTexteView.setText(msg);
    }
}
