package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsedataapp.databinding.ActivityDataBundleBinding

class DataBundleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillTextView()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }

    private fun fillTextView(){
        val getBundle = intent.extras
        val name = getBundle?.getString("name")
        val birth = getBundle?.getInt("birth")

        binding.txtNama.text = "Halo, $name"
        binding.txtUmur.text = "Umur kamu ${(2023- birth!!).toString()}"
    }
}