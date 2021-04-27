package com.projeto.minhaprimeiratelalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainPrincipal extends AppCompatActivity {

    private TextView txtAvaliarRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        txtAvaliarRest = (TextView) findViewById(R.id.txtAvaliarRest);

        txtAvaliarRest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abreAvali = new Intent(MainPrincipal.this, Tela1.class);
                startActivity(abreAvali);
            }
        });

    }
}
