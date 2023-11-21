package com.colaborartorioazul.colaborartorioazulproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Amenazas extends AppCompatActivity {

    //scrolls
    ScrollView erosionCostera, aumentoNivel, lluvias, vientos, salinidad, excesoVegetacion, contaminacionMar, basura, robos, obras, incendios, turismoPresion, vandalismo, cambiosUso;

    //textos
    TextView erosionCosteratexto, aumentoNivelTexto, lluviasTexto, vientosTexto, salinidadTexto, excesoVegetacionTexto, contaminacionMarTexto, basuraTexto, robosTexto, obrasTexto,
            incendiosTexto, turismoPresionTexto, vandalismoTexto, cambiosUsoTexto;

    //botones
    LinearLayout erosionCosteraBotones, aumentoNivelBotones, lluviasBotones, vientosBotones, salinidadBotones, excesoVegetacionBotones, contaminacionMarBotones, basuraBotones, robosBotones,
            obrasBotones, incendiosBotones, turismoPresionBotones, vandalismoBotones, cambiosUsoBotones;

    //botones si
    Button erosionCosteraBotonSi, aumentoNivelBotonSi, lluviasBotonSi, vientosBotonSi, salinidadBotonSi, excesoVegetacionBotonSi, contaminacionMarBotonSi, basuraBotonSi, robosBotonSi,
            obrasBotonSi, incendiosBotonSi, turismoPresionBotonSi, vandalismoBotonSi, cambiosUsoBotonSi;

    //botones No
    Button erosionCosteraBotonNo, aumentoNivelBotonNo, lluviasBotonNo, vientosBotonNo, salinidadBotonNo, excesoVegetacionBotonNo, contaminacionMarBotonNo, basuraBotonNo, robosBotonNo,
            obrasBotonNo, incendiosBotonNo, turismoPresionBotonNo, vandalismoBotonNo, cambiosUsoBotonNo;

    //preguntas
    LinearLayout erosionCosteraPreguntas, aumentoNivelPreguntas, lluviasPreguntas, vientosPreguntas, salinidadPreguntas, excesoVegetacionPreguntas, contaminacionMarPreguntas, basuraPreguntas,
            robosPreguntas, obrasPreguntas, incendiosPreguntas, turismoPresionPreguntas, vandalismoPreguntas, cambiosUsoPreguntas;

    //boton siguiente
    Button erosionCosteraBotonSiguiente, aumentoNivelBotonSiguiente, lluviasBotonSiguiente, vientosBotonSiguiente, salinidadBotonSiguiente, excesoVegetacionBotonSiguiente,
            contaminacionMarBotonSiguiente, basuraBotonSiguiente, robosBotonSiguiente, obrasBotonSiguiente, incendiosBotonSiguiente, turismoPresionBotonSiguiente, vandalismoBotonSiguiente,
            cambiosUsoBotonSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenazas);

        //scrollss
        erosionCostera = findViewById(R.id.erosion_costera);
        aumentoNivel = findViewById(R.id.aumento_nivel);
        lluvias = findViewById(R.id.lluvias);
        vientos = findViewById(R.id.vientos);
        salinidad = findViewById(R.id.salinidad);
        excesoVegetacion = findViewById(R.id.exceso_vegetacion);
        contaminacionMar = findViewById(R.id.contaminacion_mar);
        basura = findViewById(R.id.basura);
        robos = findViewById(R.id.robos);
        obras = findViewById(R.id.obras);
        incendios = findViewById(R.id.incendios);
        turismoPresion = findViewById(R.id.turismo_presion);
        vandalismo = findViewById(R.id.vandalismo);
        cambiosUso = findViewById(R.id.cambios);

        //textos
        erosionCosteratexto = findViewById(R.id.erosion_costera_texto);
        aumentoNivelTexto = findViewById(R.id.aumento_nivel_texto);
        lluviasTexto = findViewById(R.id.lluvias_texto);
        vientosTexto = findViewById(R.id.vientos_textos);
        salinidadTexto = findViewById(R.id.salinidad_texto);
        excesoVegetacionTexto = findViewById(R.id.exceso_vegetacion_texto);
        contaminacionMarTexto = findViewById(R.id.contaminacion_mar_texto);
        basuraTexto = findViewById(R.id.basura_texto);
        robosTexto = findViewById(R.id.robos_texto);
        obrasTexto = findViewById(R.id.obras_texto);
        incendiosTexto = findViewById(R.id.incendios_texto);
        turismoPresion = findViewById(R.id.turismo_presion);
        turismoPresionTexto = findViewById(R.id.turismo_presion_texto);
        vandalismoTexto = findViewById(R.id.vandalismo_texto);
        cambiosUsoTexto = findViewById(R.id.cambios_texto);

        //botones
        erosionCosteraBotones = findViewById(R.id.erosion_costera_botones);
        aumentoNivelBotones = findViewById(R.id.aumento_nivel_botones);
        lluviasBotones = findViewById(R.id.lluvias_botones);
        vientosBotones = findViewById(R.id.vientos_botones);
        salinidadBotones = findViewById(R.id.salinidad_botones);
        excesoVegetacionBotones = findViewById(R.id.exceso_vegetacion_botones);
        contaminacionMarBotones = findViewById(R.id.contaminacion_mar_botones);
        basuraBotones = findViewById(R.id.basura_botones);
        robosBotones = findViewById(R.id.robos_botones);
        obrasBotones = findViewById(R.id.obras_botones);
        incendiosBotones = findViewById(R.id.incendios_botones);
        turismoPresionBotones = findViewById(R.id.turismo_presion_botones);
        vandalismoBotones = findViewById(R.id.vandalismo_botones);
        cambiosUsoBotones = findViewById(R.id.cambios_botones);

        //botones si
        erosionCosteraBotonSi = findViewById(R.id.erosion_costera_boton_si);
        aumentoNivelBotonSi = findViewById(R.id.aumento_nivel_boton_si);
        lluviasBotonSi = findViewById(R.id.lluvias_boton_si);
        vientosBotonSi = findViewById(R.id.vientos_boton_si);
        salinidadBotonSi = findViewById(R.id.salinidad_boton_si);
        excesoVegetacionBotonSi = findViewById(R.id.exceso_vegetacion_boton_si);
        contaminacionMarBotonSi = findViewById(R.id.contaminacion_mar_boton_si);
        basuraBotonSi = findViewById(R.id.basura_boton_si);
        robosBotonSi = findViewById(R.id.robos_boton_si);
        obrasBotonSi = findViewById(R.id.obras_boton_si);
        incendiosBotonSi = findViewById(R.id.incendios_boton_si);
        turismoPresionBotonSi = findViewById(R.id.turismo_presion_boton_si);
        vandalismoBotonSi = findViewById(R.id.vandalismo_boton_si);
        cambiosUsoBotonSi = findViewById(R.id.cambios_boton_si);

        //botones No
        erosionCosteraBotonNo = findViewById(R.id.erosion_costera_boton_no);
        aumentoNivelBotonNo = findViewById(R.id.aumento_nivel_boton_no);
        lluviasBotonNo = findViewById(R.id.lluvias_boton_no);
        vientosBotonNo = findViewById(R.id.vientos_boton_no);
        salinidadBotonNo = findViewById(R.id.salinidad_boton_no);
        excesoVegetacionBotonNo = findViewById(R.id.exceso_vegetacion_boton_no);
        contaminacionMarBotonNo = findViewById(R.id.contaminacion_mar_boton_no);
        basuraBotonNo = findViewById(R.id.basura_boton_no);
        robosBotonNo = findViewById(R.id.robos_boton_no);
        obrasBotonNo = findViewById(R.id.obras_boton_no);
        incendiosBotonNo = findViewById(R.id.incendios_boton_no);
        turismoPresionBotonNo = findViewById(R.id.turismo_presion_boton_no);
        vandalismoBotonNo = findViewById(R.id.vandalismo_boton_no);
        cambiosUsoBotonNo = findViewById(R.id.cambios_boton_no);

        //preguntas
        erosionCosteraPreguntas = findViewById(R.id.erosion_costera_preguntas);
        aumentoNivelPreguntas = findViewById(R.id.aumento_nivel_preguntas);
        lluviasPreguntas = findViewById(R.id.lluvias_preguntas);
        vientosPreguntas = findViewById(R.id.vientos_preguntas);
        salinidadPreguntas = findViewById(R.id.salinidad_preguntas);
        excesoVegetacionPreguntas = findViewById(R.id.exceso_vegetacion_preguntas);
        contaminacionMarPreguntas = findViewById(R.id.contaminacion_mar_preguntas);
        basuraPreguntas = findViewById(R.id.basura_preguntas);
        robosPreguntas = findViewById(R.id.robos_preguntas);
        obrasPreguntas = findViewById(R.id.obras_preguntas);
        incendiosPreguntas = findViewById(R.id.incendios_preguntas);
        turismoPresionPreguntas = findViewById(R.id.turismo_presion_preguntas);
        vandalismoPreguntas = findViewById(R.id.vandalismo_preguntas);
        cambiosUsoPreguntas = findViewById(R.id.cambios_preguntas);

        //boton siguiente
        erosionCosteraBotonSiguiente = findViewById(R.id.erosion_costera_boton_siguiente);
        aumentoNivelBotonSiguiente = findViewById(R.id.aumento_nivel_boton_siguiente);
        lluviasBotonSiguiente = findViewById(R.id.lluvias_boton_siguiente);
        vientosBotonSiguiente = findViewById(R.id.vientos_boton_siguiente);
        salinidadBotonSiguiente = findViewById(R.id.salinidad_boton_siguiente);
        excesoVegetacionBotonSiguiente = findViewById(R.id.exceso_vegetacion_boton_siguiente);
        contaminacionMarBotonSiguiente = findViewById(R.id.contaminacion_mar_boton_siguiente);
        basuraBotonSiguiente = findViewById(R.id.basura_boton_siguiente);
        robosBotonSiguiente = findViewById(R.id.robos_boton_siguiente);
        obrasBotonSiguiente = findViewById(R.id.obras_boton_siguiente);
        incendiosBotonSiguiente = findViewById(R.id.incendios_boton_siguiente);
        turismoPresionBotonSiguiente = findViewById(R.id.turismo_presion_boton_siguiente);
        vandalismoBotonSiguiente = findViewById(R.id.vandalismo_boton_siguiente);
        cambiosUsoBotonSiguiente = findViewById(R.id.cambios_boton_siguiente);

        //ejecucion
        ErosionCostera();
        AumentoNivel();
        Lluvias();
        Vientos();
        Salinidad();
        ExcesoVegetacion();
        ContaminacionMar();
        Basura();
        Robos();
        Obras();
        Incendios();
        TurismoPresion();
        Vandalismo();
        Cambios();
    }

    public void ErosionCostera(){
        erosionCosteraBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                erosionCostera.setVisibility(View.GONE);
                aumentoNivel.setVisibility(View.VISIBLE);
            }
        });

        erosionCosteraBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                erosionCosteratexto.setVisibility(View.GONE);
                erosionCosteraBotones.setVisibility(View.GONE);
                erosionCosteraPreguntas.setVisibility(View.VISIBLE);
            }
        });

        erosionCosteraBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                erosionCostera.setVisibility(View.GONE);
                aumentoNivel.setVisibility(View.VISIBLE);
            }
        });
    }

    public void AumentoNivel(){
        aumentoNivelBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentoNivel.setVisibility(View.GONE);
                lluvias.setVisibility(View.VISIBLE);
            }
        });

        aumentoNivelBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentoNivelTexto.setVisibility(View.GONE);
                aumentoNivelBotones.setVisibility(View.GONE);
                aumentoNivelPreguntas.setVisibility(View.VISIBLE);
            }
        });

        aumentoNivelBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentoNivel.setVisibility(View.GONE);
                lluvias.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Lluvias(){
        lluviasBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lluvias.setVisibility(View.GONE);
                vientos.setVisibility(View.VISIBLE);
            }
        });

        lluviasBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lluviasTexto.setVisibility(View.GONE);
                lluviasBotones.setVisibility(View.GONE);
                lluviasPreguntas.setVisibility(View.VISIBLE);
            }
        });

        lluviasBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lluvias.setVisibility(View.GONE);
                vientos.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Vientos(){
        vientosBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vientos.setVisibility(View.GONE);
                salinidad.setVisibility(View.VISIBLE);
            }
        });

        vientosBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vientosTexto.setVisibility(View.GONE);
                vientosBotones.setVisibility(View.GONE);
                vientosPreguntas.setVisibility(View.VISIBLE);
            }
        });

        vientosBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vientos.setVisibility(View.GONE);
                salinidad.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Salinidad(){
        salinidadBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salinidad.setVisibility(View.GONE);
                excesoVegetacion.setVisibility(View.VISIBLE);
            }
        });

        salinidadBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salinidadTexto.setVisibility(View.GONE);
                salinidadBotones.setVisibility(View.GONE);
                salinidadPreguntas.setVisibility(View.VISIBLE);
            }
        });

        salinidadBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salinidad.setVisibility(View.GONE);
                excesoVegetacion.setVisibility(View.VISIBLE);
            }
        });
    }

    public void ExcesoVegetacion(){
        excesoVegetacionBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                excesoVegetacion.setVisibility(View.GONE);
                contaminacionMar.setVisibility(View.VISIBLE);
            }
        });

        excesoVegetacionBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                excesoVegetacionTexto.setVisibility(View.GONE);
                excesoVegetacionBotones.setVisibility(View.GONE);
                excesoVegetacionPreguntas.setVisibility(View.VISIBLE);
            }
        });

        excesoVegetacionBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                excesoVegetacion.setVisibility(View.GONE);
                contaminacionMar.setVisibility(View.VISIBLE);
            }
        });
    }

    public void ContaminacionMar(){
        contaminacionMarBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contaminacionMar.setVisibility(View.GONE);
                basura.setVisibility(View.VISIBLE);
            }
        });

        contaminacionMarBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contaminacionMarTexto.setVisibility(View.GONE);
                contaminacionMarBotones.setVisibility(View.GONE);
                contaminacionMarPreguntas.setVisibility(View.VISIBLE);
            }
        });

        contaminacionMarBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contaminacionMar.setVisibility(View.GONE);
                basura.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Basura(){
        basuraBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basura.setVisibility(View.GONE);
                robos.setVisibility(View.VISIBLE);
            }
        });

        basuraBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basuraTexto.setVisibility(View.GONE);
                basuraBotones.setVisibility(View.GONE);
                basuraPreguntas.setVisibility(View.VISIBLE);
            }
        });

        basuraBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basura.setVisibility(View.GONE);
                robos.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Robos(){
        robosBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                robos.setVisibility(View.GONE);
                obras.setVisibility(View.VISIBLE);
            }
        });

        robosBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                robosTexto.setVisibility(View.GONE);
                robosBotones.setVisibility(View.GONE);
                robosPreguntas.setVisibility(View.VISIBLE);
            }
        });

        robosBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                robos.setVisibility(View.GONE);
                obras.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Obras(){
        obrasBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obras.setVisibility(View.GONE);
                incendios.setVisibility(View.VISIBLE);
            }
        });

        obrasBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obrasTexto.setVisibility(View.GONE);
                obrasBotones.setVisibility(View.GONE);
                obrasPreguntas.setVisibility(View.VISIBLE);
            }
        });

        obrasBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obras.setVisibility(View.GONE);
                incendios.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Incendios(){
        incendiosBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incendios.setVisibility(View.GONE);
                turismoPresion.setVisibility(View.VISIBLE);
            }
        });

        incendiosBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incendiosTexto.setVisibility(View.GONE);
                incendiosBotones.setVisibility(View.GONE);
                incendiosPreguntas.setVisibility(View.VISIBLE);
            }
        });

        incendiosBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incendios.setVisibility(View.GONE);
                turismoPresion.setVisibility(View.VISIBLE);
            }
        });
    }

    public void TurismoPresion(){
        turismoPresionBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turismoPresion.setVisibility(View.GONE);
                vandalismo.setVisibility(View.VISIBLE);
            }
        });

        turismoPresionBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turismoPresionTexto.setVisibility(View.GONE);
                turismoPresionBotones.setVisibility(View.GONE);
                turismoPresionPreguntas.setVisibility(View.VISIBLE);
            }
        });

        turismoPresionBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turismoPresion.setVisibility(View.GONE);
                vandalismo.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Vandalismo(){
        vandalismoBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vandalismo.setVisibility(View.GONE);
                cambiosUso.setVisibility(View.VISIBLE);
            }
        });

        vandalismoBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vandalismoTexto.setVisibility(View.GONE);
                vandalismoBotones.setVisibility(View.GONE);
                vandalismoPreguntas.setVisibility(View.VISIBLE);
            }
        });

        vandalismoBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vandalismo.setVisibility(View.GONE);
                cambiosUso.setVisibility(View.VISIBLE);
            }
        });
    }

    public void Cambios(){
        cambiosUsoBotonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Amenazas.this, Glosario.class));
                finish();
            }
        });

        cambiosUsoBotonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiosUsoTexto.setVisibility(View.GONE);
                cambiosUsoBotones.setVisibility(View.GONE);
                cambiosUsoPreguntas.setVisibility(View.VISIBLE);
            }
        });

        cambiosUsoBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Amenazas.this, Glosario.class));
                finish();
            }
        });
    }
}