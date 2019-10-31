package com.example.authentification;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity  {
    Button b1,b2;
    EditText ed1,ed2;
    TextView tx1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.b1 = (Button)findViewById(R.id.button);
        this.b2 = (Button)findViewById(R.id.effacer);
       this. ed1 = (EditText)findViewById(R.id.editText);
        this.ed2 = (EditText)findViewById(R.id.editText2);

        this.tx1 = (TextView)findViewById(R.id.textView3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("ilhem") &&
                        ed2.getText().toString().equals("ilhem")) {
                 TextView textView4=(TextView)findViewById(R.id.textView4);
                    textView4.setTextColor(Color.GREEN);
                    textView4.setText("authentification réussite");

                }
                else{
                    TextView textView4=(TextView)findViewById(R.id.textView4);
                    textView4.setTextColor(Color.RED);
                    textView4.setText("echec d'authentification");
                }


                }

        });
        //programmation de la bouton effacer
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("");
            }
        });
        }

    }
