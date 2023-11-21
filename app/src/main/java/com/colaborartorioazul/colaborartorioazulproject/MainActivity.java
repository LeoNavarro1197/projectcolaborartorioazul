package com.colaborartorioazul.colaborartorioazulproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);


        Bundle intent = getIntent().getExtras();
        if (intent != null){
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

                    if(item.getItemId() == R.id.nav_home){
                        selectedfragment = new HomeFragment();
                    } else if (item.getItemId() == R.id.nav_search) {
                        selectedfragment = new SearchFragment();
                    } else if (item.getItemId() == R.id.nav_add) {
                        selectedfragment = null;
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
}