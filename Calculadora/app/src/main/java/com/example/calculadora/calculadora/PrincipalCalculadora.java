package com.example.calculadora.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalCalculadora extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPonto,buttonIgual,buttonBack, buttonDel,
    buttonDiv,buttonMult,buttonSubt,buttonSoma;

    TextView textView1,textView2, textOperacao,textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_calculadora);

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonPonto = (Button)findViewById(R.id.buttonPonto);
        buttonIgual = (Button)findViewById(R.id.buttonIgual);
        buttonBack = (Button)findViewById(R.id.buttonBack);
        buttonDel = (Button)findViewById(R.id.buttonDel);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonMult = (Button)findViewById(R.id.buttonMult);
        buttonSoma = (Button)findViewById(R.id.buttonSoma);
        buttonSubt = (Button)findViewById(R.id.buttonSubt);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textOperacao = (TextView)findViewById(R.id.textOperacao);
        textResult = (TextView)findViewById(R.id.textResult);

    }
    boolean bool = false;

    public void Button_0 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "0");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "0");
        }
    }
    public void Button_1 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "1");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "1");
        }
    }
    public void Button_2 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "2");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "2");
        }
    }
    public void Button_3 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "3");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "3");
        }
    }
    public void Button_4 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "4");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "4");
        }
    }
    public void Button_5 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "5");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "5");
        }
    }
    public void Button_6 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "6");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "6");
        }
    }
    public void Button_7 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "7");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "7");
        }
    }
    public void Button_8 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "8");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "8");
        }
    }
    public void Button_9 (View v){
        if(bool == false){
            String str = textView1.getText().toString();
            textView1.setText(str + "9");
        }else{
            String str = textView2.getText().toString();
            textView2.setText(str + "9");
        }
    }
    public void Button_Ponto (View v){
        if (bool == false) {
            String strponto = textView1.getText().toString();
            if (strponto.contains(".")){

            }
        else {
            String str = textView1.getText().toString();
            textView1.setText(str + ".");
            }
        }else{
            String strponto = textView2.getText().toString();
            if (strponto.contains(".")){

            }else{
             String str = textView2.getText().toString();
             textView2.setText(str + ".");
            }
        }
    }
    public void Button_Igual (View v){
         String textView_1 = textView1.getText().toString();
         String textView_2 = textView2.getText().toString();
         String text_Operacao = textOperacao.getText().toString();
         String text_Result = textResult.getText().toString();
              if (textView_2.length() > 0){
                   double txt1 = Double.parseDouble(textView_1);
                  double txt2 = Double.parseDouble(textView_2);
                      if (text_Operacao.contains("/")){
                          double contas = txt1 / txt2;
                          String str = Double.toString(contas);
                          bool = false;
                          textView1.setText("");
                          textView2.setText("");
                          textOperacao.setText("");
                          textResult.setText(str);
                          Toast.makeText(PrincipalCalculadora.this, str, Toast.LENGTH_SHORT).show();
                      }
                      else if (text_Operacao.contains("*")){
                          double contas = txt1 * txt2;
                          String str = Double.toString(contas);
                          bool = false;
                          textView1.setText("");
                          textView2.setText("");
                          textOperacao.setText("");
                          textResult.setText(str);
                          Toast.makeText(PrincipalCalculadora.this, str, Toast.LENGTH_SHORT).show();
                      }
                      else if (text_Operacao.contains("-")){
                          double contas = txt1 - txt2;
                          String str = Double.toString(contas);
                          bool = false;
                          textView1.setText("");
                          textView2.setText("");
                          textOperacao.setText("");
                          textResult.setText(str);
                          Toast.makeText(PrincipalCalculadora.this, str, Toast.LENGTH_SHORT).show();
                      }
                      else if (text_Operacao.contains("+")){
                          double contas = txt1 + txt2;
                          String str = Double.toString(contas);
                          bool = false;
                          textView1.setText("");
                          textView2.setText("");
                          textOperacao.setText("");
                          textResult.setText(str);
                          Toast.makeText(PrincipalCalculadora.this, str, Toast.LENGTH_SHORT).show();
                      }
                      else{
                          Toast.makeText(PrincipalCalculadora.this, "Operação iválida", Toast.LENGTH_SHORT).show();
                      }
              }else {
                  Toast.makeText(PrincipalCalculadora.this, textView_1, Toast.LENGTH_SHORT).show();
              }
    }
    public void Button_Back (View v){
       if (bool == false){
           String str = textView1.getText().toString();
           if (str.length()>1){
               String str_sub = str.substring(0,str.length()-1);
               textView1.setText(str_sub);
           }
           else {
               textView1.setText("");
           }
       }
       else {
           String str = textView2.getText().toString();
           if (str.length()>1){
               String str_sub = str.substring(0,str.length()-1);
               textView2.setText(str_sub);
           }
           else {
               textView2.setText("");
           }
       }
    }
    public void Button_Del (View v){
       bool = false;
        textView1.setText("");
        textView2.setText("");
        textOperacao.setText("");
        textResult.setText("");
    }
    public void Button_Div (View v){
        bool = true;
        textOperacao.setText("/");
    }
    public void Button_Mult (View v){ bool = true;
        textOperacao.setText("*");
    }
    public void Button_Subt (View v){
        bool = true;
        textOperacao.setText("-");
    }
    public void Button_Soma (View v){
        bool = true;
        textOperacao.setText("+");
       }
   }
