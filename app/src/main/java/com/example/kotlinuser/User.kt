package com.example.kotlinuser

data class User(var firstName: String? = null, var lastName: String? = null)

val jane = User(firstName = "Jane")
val joe = User(firstName = "Joe", lastName = "Doe")
