package com.colaborartorioazul.colaborartorioazulproject;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class StartActivity extends AppCompatActivity {

    Button login, register, btn_intro;
    ImageView pdf;
    FirebaseUser firebaseUser;
    LinearLayout start, intro;
    private static final int REQUEST_PERMISSION = 1;
    private static final int REQUEST_PERMISSION_CAMERA = 1;

    @Override
    protected void onStart() {
        super.onStart();

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        //check if user is null
        if (firebaseUser != null){
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        checkPermission();

        getLocalizacion();

        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        btn_intro = findViewById(R.id.boton_intro);
        intro = findViewById(R.id.intro);
        start = findViewById(R.id.start);
        pdf = findViewById(R.id.btnDownload);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartActivity.this, LoginActivity.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartActivity.this, RegisterActivity.class));
            }
        });

        btn_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setVisibility(View.GONE);
                start.setVisibility(View.VISIBLE);
            }
        });

        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                descargarPDF(view);
            }
        });
    }

    private void getLocalizacion() {
        int permiso = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION);
        if(permiso == PackageManager.PERMISSION_DENIED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.ACCESS_FINE_LOCATION)){
            }else{
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }
        }
    }

    public void descargarPDF(View view) {
        new DownloadTask().execute("https://firebasestorage.googleapis.com/v0/b/colaborartorioazul-63982.appspot.com/o/Escalas%20Colaborator%C3%ADo%20y%20Antropoceno%20_compressed.pdf?alt=media&token=aa91f741-0714-4de6-901f-529b70475cb3");
    }

    private void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_PERMISSION_CAMERA);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permiso concedido
            } else {
                Toast.makeText(this, "Se necesita permiso para escribir en el almacenamiento externo", Toast.LENGTH_SHORT).show();
            }
        }

        if (requestCode == REQUEST_PERMISSION_CAMERA) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permiso concedido
            } else {
                Toast.makeText(this, "Se necesita permiso para ingresar en la camara de tu dispositivo", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private class DownloadTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream input = new BufferedInputStream(url.openStream(), 8192);
                File directory = new File(Environment.getExternalStorageDirectory().toString() + "/Download");
                directory.mkdirs();
                File outputFile = new File(directory, "Escala.pdf");
                FileOutputStream outputStream = new FileOutputStream(outputFile);

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.flush();
                outputStream.close();
                input.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            Toast.makeText(getApplicationContext(), "Descarga completada. Se verá reflejada en la carpeta Downloads", Toast.LENGTH_SHORT).show();
        }
    }
}