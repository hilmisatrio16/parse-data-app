package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsedataapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBundle.setOnClickListener {
            startActivity(Intent(this, BundleActivity::class.java))
        }

        binding.btnSerializable.setOnClickListener {
            startActivity(Intent(this, SerializableActivity::class.java))
        }
        binding.btnParcelable.setOnClickListener {
            startActivity(Intent(this, ParcelableActivity::class.java))
        }
    }
}