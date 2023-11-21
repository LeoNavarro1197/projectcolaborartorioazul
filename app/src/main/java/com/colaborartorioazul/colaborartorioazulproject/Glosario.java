package com.colaborartorioazul.colaborartorioazulproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Glosario extends AppCompatActivity {

    ScrollView glosario, linearLayout3;
    Button siguiente3, boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glosario);

        siguiente3 = findViewById(R.id.boton_3);
        //fin = findViewById(R.id.boton_fin);
        boton4 = findViewById(R.id.boton_4);
        glosario = findViewById(R.id.glosario);

        linearLayout3 = findViewById(R.id.encuesta_3);

        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout3.setVisibility(View.GONE);
                glosario.setVisibility(View.VISIBLE);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Glosario.this, PostActivity.class));
                finish();
            }
        });
    }
}