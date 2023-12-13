package com.colaborartorioazul.colaborartorioazulproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.colaborartorioazul.colaborartorioazulproject.fragment.ProfileFragment;

public class Encuestas extends AppCompatActivity {

    Button siguiente1, botonEncuestaLugar, botonVulnerabilidadLugar, botonAmenaza;
    LinearLayout bienvenidaVulnerabilidad, bienvenidaAmenaza, progressBar;
    ScrollView scrollEncuestaInicial, linearLayout1;


    private static final int REQUEST_PERMISSION_LOCATION = 1;

    public int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuestas);

        checkPermission();

        progressBar = findViewById(R.id.progress_circular_amenaza);

        scrollEncuestaInicial = findViewById(R.id.scroll_encuesta_inicial);

        botonEncuestaLugar = findViewById(R.id.boton_encuesta_lugar);
        botonVulnerabilidadLugar = findViewById(R.id.boton_vulnerabilidad_lugar);
        siguiente1 = findViewById(R.id.boton_1);
        botonAmenaza = findViewById(R.id.boton_amenaza);


        bienvenidaVulnerabilidad = findViewById(R.id.bienvenida_vulnerabilidad);
        linearLayout1 = findViewById(R.id.encuesta_1);
        bienvenidaAmenaza = findViewById(R.id.bienvenida_amenaza);

        CheckBoxEventsUno();

        botonEncuestaLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollEncuestaInicial.setVisibility(View.GONE);
                bienvenidaVulnerabilidad.setVisibility(View.VISIBLE);
            }
        });

        botonVulnerabilidadLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bienvenidaVulnerabilidad.setVisibility(View.GONE);
                linearLayout1.setVisibility(View.VISIBLE);
            }
        });

        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout1.setVisibility(View.GONE);
                bienvenidaAmenaza.setVisibility(View.VISIBLE);

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Encuestas.this);

                if(contador >= 0 && contador <= 10){
                    alertDialog.setMessage("Su estado actual es: Poco Vulnerable");
                    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //
                        }
                    });
                } else if (contador >= 11 && contador <= 15) {
                    alertDialog.setMessage("Su estado actual es: Medianamente Vulnerable");
                    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //
                        }
                    });
                } else if (contador >= 16 && contador <= 20) {
                    alertDialog.setMessage("Su estado actual es: Bastante Vulnerable");
                    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //
                        }
                    });
                } else if (contador >= 21 && contador <= 26) {
                    alertDialog.setMessage("Su estado actual es: Muy Vulnerable");
                    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //
                        }
                    });
                }

                alertDialog.show();
            }
        });

        botonAmenaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bienvenidaAmenaza.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);
                startActivity(new Intent(Encuestas.this, Amenazas.class));
                finish();
            }
        });
    }
    //FIN ONCREATE


    public void CheckBoxEventsUno(){
        CheckBox encuesta_uno_caja_1 = findViewById(R.id.encuesta_uno_caja_1);
        CheckBox encuesta_uno_caja_2 = findViewById(R.id.encuesta_uno_caja_2);
        CheckBox encuesta_uno_caja_3 = findViewById(R.id.encuesta_uno_caja_3);
        CheckBox encuesta_uno_caja_4 = findViewById(R.id.encuesta_uno_caja_4);
        CheckBox encuesta_uno_caja_5 = findViewById(R.id.encuesta_uno_caja_5);
        CheckBox encuesta_uno_caja_6 = findViewById(R.id.encuesta_uno_caja_6);
        CheckBox encuesta_uno_caja_7 = findViewById(R.id.encuesta_uno_caja_7);
        CheckBox encuesta_uno_caja_8 = findViewById(R.id.encuesta_uno_caja_8);
        CheckBox encuesta_uno_caja_9 = findViewById(R.id.encuesta_uno_caja_9);
        CheckBox encuesta_uno_caja_10 = findViewById(R.id.encuesta_uno_caja_10);
        CheckBox encuesta_uno_caja_11 = findViewById(R.id.encuesta_uno_caja_11);
        CheckBox encuesta_uno_caja_12 = findViewById(R.id.encuesta_uno_caja_12);
        CheckBox encuesta_uno_caja_13 = findViewById(R.id.encuesta_uno_caja_13);
        CheckBox encuesta_uno_caja_14 = findViewById(R.id.encuesta_uno_caja_14);
        CheckBox encuesta_uno_caja_15 = findViewById(R.id.encuesta_uno_caja_15);
        CheckBox encuesta_uno_caja_16 = findViewById(R.id.encuesta_uno_caja_16);
        CheckBox encuesta_uno_caja_17 = findViewById(R.id.encuesta_uno_caja_17);
        CheckBox encuesta_uno_caja_18 = findViewById(R.id.encuesta_uno_caja_18);
        CheckBox encuesta_uno_caja_19 = findViewById(R.id.encuesta_uno_caja_19);
        CheckBox encuesta_uno_caja_20 = findViewById(R.id.encuesta_uno_caja_20);
        CheckBox encuesta_uno_caja_21 = findViewById(R.id.encuesta_uno_caja_21);
        CheckBox encuesta_uno_caja_22 = findViewById(R.id.encuesta_uno_caja_22);
        CheckBox encuesta_uno_caja_23 = findViewById(R.id.encuesta_uno_caja_23);
        CheckBox encuesta_uno_caja_24 = findViewById(R.id.encuesta_uno_caja_24);
        CheckBox encuesta_uno_caja_25 = findViewById(R.id.encuesta_uno_caja_25);
        CheckBox encuesta_uno_caja_26 = findViewById(R.id.encuesta_uno_caja_26);

        encuesta_uno_caja_1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_5.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_6.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_7.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_8.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_9.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_10.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_11.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_12.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_13.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_14.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_15.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_16.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_17.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_18.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_19.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_20.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_21.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_22.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_23.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_24.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_25.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });

        encuesta_uno_caja_26.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                contador++;
            }
        });
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION_LOCATION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permiso concedido
            } else {
                Toast.makeText(this, "Se necesita permiso para ingresar en la camara de tu dispositivo", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_PERMISSION_LOCATION);
            }
        }
    }
}