
package com.example.parsedataapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.parsedataapp.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {

    private lateinit var binding : ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            parseData()
        }

    }

    private fun checkTextField() : Boolean{
        return binding.etName.text!!.isNotEmpty() && binding.etEmail.text!!.isNotEmpty() &&
                binding.etPhoneNumber.text!!.isNotEmpty() && binding.etAddress.text!!.isNotEmpty() &&
                binding.etAge.text!!.isNotEmpty()
    }

    private fun parseData(){
        if(checkTextField()){

            val intent = Intent(this, DataParcelableActivity::class.java)
            val personParcelable = PersonParcelable(binding.etName.text.toString(),
                binding.etEmail.text.toString(),
                binding.etPhoneNumber.text.toString(),
                binding.etAddress.text.toString(),
                binding.etAge.text.toString().toInt())

            intent.putExtra("DATA_PERSON_PARCELABLE", personParcelable)
            startActivity(intent)

        }else{
            Toast.makeText(this, "Mohon masukkan data dengan benar!", Toast.LENGTH_SHORT).show()
        }
    }
}