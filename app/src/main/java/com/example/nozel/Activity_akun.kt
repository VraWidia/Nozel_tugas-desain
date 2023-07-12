package com.example.nozel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.nozel.databinding.ActivityAkunBinding


class Activity_akun : AppCompatActivity() {
    lateinit var binding: ActivityAkunBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAkunBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_akun)
        val pp=findViewById<Button>(R.id.tbakun )
        pp.setOnClickListener {
            val intent = Intent(this, Activity_profil::class.java)
            startActivity(intent)
        }
        val klikme=findViewById<Button>(R.id.klikme )
        klikme.setOnClickListener {
            Toast.makeText( this,"Hai There, i'm using nozel", Toast.LENGTH_SHORT).show()
        }
    }

}