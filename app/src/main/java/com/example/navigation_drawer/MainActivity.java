package com.example.navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);

            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {

                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "Beranda is Clicked", Toast.LENGTH_SHORT).show();break;
//                        Intent intent = new Intent(MainActivity.this, BerandaActivity.class);
//                        startActivity(intent);
//                        return true;
                    case R.id.nav_message:
//                        Toast.makeText(MainActivity.this, "Message is Clicked",Toast.LENGTH_SHORT).show();break;
                        Intent intentt = new Intent(MainActivity.this, SekolahActivity.class);
                        startActivity(intentt);
                        return true;
                    case R.id.synch:
//                        Toast.makeText(MainActivity.this, "Synch is Clicked",Toast.LENGTH_SHORT).show();break;
                        Intent intenttt = new Intent(MainActivity.this, PetaActivity.class);
                        startActivity(intenttt);
                        return true;
                    case R.id.trash:
//                        Toast.makeText(MainActivity.this, "Trash is Clicked",Toast.LENGTH_SHORT).show();break;
                        Intent intentttt = new Intent(MainActivity.this, BuktiActivity.class);
                        startActivity(intentttt);
                        return true;
//                    case R.id.settings:
//                        Toast.makeText(MainActivity.this, "Settings is Clicked",Toast.LENGTH_SHORT).show();break;
//                    case R.id.nav_login:
//                        Toast.makeText(MainActivity.this, "Login is Clicked",Toast.LENGTH_SHORT).show();break;
//                    case R.id.nav_share:
//                        Toast.makeText(MainActivity.this, "Share is clicked",Toast.LENGTH_SHORT).show();break;
//                    case R.id.nav_rate:
//                    Toast.makeText(MainActivity.this, "Rate us is Clicked",Toast.LENGTH_SHORT).show();break;
                    default:
                    return true;

                }
                return true;
            }
        });


    }
}