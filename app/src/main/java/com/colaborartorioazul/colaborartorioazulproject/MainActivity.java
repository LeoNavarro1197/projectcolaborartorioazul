package com.colaborartorioazul.colaborartorioazulproject;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.colaborartorioazul.colaborartorioazulproject.fragment.ABCFragment;
import com.colaborartorioazul.colaborartorioazulproject.fragment.HomeFragment;
import com.colaborartorioazul.colaborartorioazulproject.fragment.NotificationFragment;
import com.colaborartorioazul.colaborartorioazulproject.fragment.ProfileFragment;
import com.colaborartorioazul.colaborartorioazulproject.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    Fragment selectedfragment = null;

    private static final int REQUEST_PERMISSION_CAMERA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPermission();

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);


        Bundle intent = getIntent().getExtras();
        if (intent != null) {
            String publisher = intent.getString("publisherid");

            SharedPreferences.Editor editor = getSharedPreferences("PREFS", MODE_PRIVATE).edit();
            editor.putString("profileid", publisher);
            editor.apply();

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ProfileFragment()).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    if (item.getItemId() == R.id.nav_home) {
                        selectedfragment = new HomeFragment();
                    } else if (item.getItemId() == R.id.nav_search) {
                        selectedfragment = new SearchFragment();
                    } else if (item.getItemId() == R.id.nav_add) {
                        selectedfragment = null;
                        //startActivity(new Intent(MainActivity.this, PostActivity.class));
                        startActivity(new Intent(MainActivity.this, Encuestas.class));
                    } else if (item.getItemId() == R.id.nav_heart) {
                        selectedfragment = new NotificationFragment();
                    } else if (item.getItemId() == R.id.nav_profile) {
                        SharedPreferences.Editor editor = getSharedPreferences("PREFS", MODE_PRIVATE).edit();
                        editor.putString("profileid", FirebaseAuth.getInstance().getCurrentUser().getUid());
                        editor.apply();
                        selectedfragment = new ProfileFragment();
                    }

                    if (selectedfragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedfragment).commit();
                    }

                    return true;
                }
            };

    private void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_PERMISSION_CAMERA);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION_CAMERA) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permiso concedido
            } else {
                Toast.makeText(this, "Se necesita permiso para ingresar en la camara de tu dispositivo", Toast.LENGTH_SHORT).show();
            }
        }
    }
}