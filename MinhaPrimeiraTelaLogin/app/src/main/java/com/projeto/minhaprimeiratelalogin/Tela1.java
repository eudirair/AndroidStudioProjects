package com.projeto.minhaprimeiratelalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;

public class Tela1 extends AppCompatActivity {

    private EditText titulo;
    private Spinner genero;
    private Spinner cidade;
    private Switch ativa;
    private RatingBar avaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        titulo = (EditText)findViewById(R.id.editTextTitulo);
        genero = (Spinner)findViewById(R.id.spinnerGenero);
        cidade = (Spinner)findViewById(R.id.spinnerCidade);
        ativa = (Switch)findViewById(R.id.switchAtiva);
        avaliacao = (RatingBar)findViewById(R.id.ratingBarAvaliacao);

    }

    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_tela1,menu);
        return true;
    }

    public  boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.menuItemAvaliar){

            Intent i = new Intent(this, Tela2.class);
            i.putExtra("titulo", titulo.getText().toString());
            i.putExtra("genero", genero.getSelectedItem().toString());
            i.putExtra("cidade", cidade.getSelectedItem().toString());
            if (ativa.isChecked()){
                i.putExtra("ativa", "Ativa");
            }else{
                i.putExtra("ativa", "Inativa");
            }
            i.putExtra("avaliacao", String.valueOf(avaliacao.getRating()));
            startActivity( i );

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
