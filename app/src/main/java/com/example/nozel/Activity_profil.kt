package com.example.nozel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.nozel.databinding.ActivityMainBinding
import com.example.nozel.databinding.ActivityProfilBinding

class Activity_profil : AppCompatActivity() {

    lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)


        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}

