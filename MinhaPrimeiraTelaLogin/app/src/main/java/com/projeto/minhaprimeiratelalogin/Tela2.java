package com.projeto.minhaprimeiratelalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private TextView titulo, genero, cidade, ativa, avaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        titulo = (TextView)findViewById(R.id.textViewTitulo);
        genero = (TextView)findViewById(R.id.textViewGenero);
        cidade = (TextView)findViewById(R.id.textViewCidade);
        ativa = (TextView)findViewById(R.id.textViewAtiva);
        avaliacao = (TextView)findViewById(R.id.textViewAvaliacao);

        Intent i = getIntent();
        titulo.setText(i.getStringExtra("titulo"));
        genero.setText(i.getStringExtra("genero"));
        cidade.setText(i.getStringExtra("cidade"));
        ativa.setText(i.getStringExtra("ativa"));
        avaliacao.setText(i.getStringExtra("avaliacao"));

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_tela2,menu);
        return true;
    }

    public  boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.menuItemCompartilhar){

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            String texto = titulo.getText().toString();
            texto +=" | " + genero.getText().toString();
            texto +=" | " + cidade.getText().toString();
            texto +=" | " + ativa.getText().toString();
            texto +=" | " + avaliacao.getText().toString();
            i.putExtra(Intent.EXTRA_TEXT, texto);
            startActivity(Intent.createChooser(i, "compartilhar..."));
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }

}
