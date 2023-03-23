package com.example.parsedataapp

import java.io.Serializable

data class PersonSerializable(
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val age: Int
) : Serializable
