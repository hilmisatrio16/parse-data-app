package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.parsedataapp.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            parseData()
        }
    }

    fun checkTextField() : Boolean{
        return binding.etName.text!!.isNotEmpty() && binding.etTahunLahir.text!!.isNotEmpty()
    }

    fun parseData(){
        if(checkTextField()){
            val intent = Intent(this, DataBundleActivity::class.java)
            val bundle = Bundle().apply {
                putString("name", binding.etName.text.toString())
                putInt("birth", binding.etTahunLahir.text.toString().toInt())
            }
            intent.putExtras(bundle)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Mohon masukkan data dengan benar!", Toast.LENGTH_SHORT).show()
        }
    }
}