package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsedataapp.databinding.ActivityDataSerializableBinding

class DataSerializableActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDataSerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataSerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillTextView()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    private fun fillTextView(){
        val getDataPerson = intent.getSerializableExtra("DATA_PERSON_SERIALIZABLE") as PersonSerializable
        val name = getDataPerson.name
        val email = getDataPerson.email
        val phone = getDataPerson.phone
        val address = getDataPerson.address
        val age = getDataPerson.age

        binding.tvNama.text = name
        binding.tvEmail.text = email
        binding.tvPhone.text = phone
        binding.tvAddress.text = address
        binding.tvAge.text = age.toString()
    }
}