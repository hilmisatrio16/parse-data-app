package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsedataapp.databinding.ActivityDataParcelableBinding

class DataParcelableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillTextView()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
    private fun fillTextView(){
        val getDataPerson = intent.getParcelableExtra<PersonParcelable>("DATA_PERSON_PARCELABLE") as PersonParcelable
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