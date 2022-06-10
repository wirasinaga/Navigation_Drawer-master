package com.example.navigation_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_drawer.R
import com.google.android.material.appbar.MaterialToolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import android.widget.Toast
import android.content.Intent
import com.example.navigation_drawer.SekolahActivity
import com.example.navigation_drawer.PetaActivity
import com.example.navigation_drawer.BuktiActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        toolbar.setNavigationOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }
        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId
            drawerLayout.closeDrawer(GravityCompat.START)
            when (id) {
                R.id.nav_home -> Toast.makeText(this@MainActivity, "Beranda is Clicked", Toast.LENGTH_SHORT).show()
                R.id.nav_message -> {
                    //                        Toast.makeText(MainActivity.this, "Message is Clicked",Toast.LENGTH_SHORT).show();break;
                    val intentt = Intent(this@MainActivity, SekolahActivity::class.java)
                    startActivity(intentt)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.synch -> {
                    //                        Toast.makeText(MainActivity.this, "Synch is Clicked",Toast.LENGTH_SHORT).show();break;
                    val intenttt = Intent(this@MainActivity, PetaActivity::class.java)
                    startActivity(intenttt)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.trash -> {
                    //                        Toast.makeText(MainActivity.this, "Trash is Clicked",Toast.LENGTH_SHORT).show();break;
                    val intentttt = Intent(this@MainActivity, BuktiActivity::class.java)
                    startActivity(intentttt)
                    return@OnNavigationItemSelectedListener true
                }
                else -> return@OnNavigationItemSelectedListener true
            }
            true
        })
    }
}