package com.example.nozel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nozel.util.pref
import com.example.nozel.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_cari, R.id.navigation_perpus, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setupWithNavController(navController)
        navView.setOnNavigationItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_notifications) {
                val s = pref(this)
                if (s.getISlogin()) {
                    Log.d("TAG", "SUDAH LOGIN")
                } else {
                    //startActivity(Intent(this,LoginActivity::class.java))
                    startActivity(Intent(this, ActivityLogin::class.java))
                    Log.d("TAG", "Belum Login pindah ke hal login")
                }
                true
            } else {
                Log.d("TAG", "onCreate yg Lain" + item.itemId)
                navController.navigate(item.itemId)
                true
            }
        }





        // Dalam fungsi onCreate() aktivitas yang sudah ada:
        val button = findViewById<Button>(R.id.btnprofil) // Temukan tombol yang ingin digunakan
        button.setOnClickListener {
            val intent = Intent(this, Activity_akun::class.java)
            startActivity(intent)
        }


//        menampilkan penarikan
        val trk = findViewById<Button>(R.id.trk)
        trk.setOnClickListener {
            Toast.makeText( this,"Mas Moko Adalah masnya adek cintai benerkan,tayang banget,muuach,muaach,muaach,atapuuuu", Toast.LENGTH_SHORT).show()
        }


    }

}
