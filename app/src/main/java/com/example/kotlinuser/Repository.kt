package com.example.kotlinuser

import java.util.*

object Repository {
    private val users = mutableListOf<User>()
    fun getUsers(): List<User>? {
        return users
    }

    val formattedUserNames: List<String?>
        get() {
            val userNames: MutableList<String> =
                ArrayList(users.size)
            for ((firstName, lastName) in users) {
                val name: String
                name = if (lastName != null) {
                    if (firstName != null) {
                        firstName + " " + lastName
                    } else {
                        lastName
                    }
                }  else {
                    firstName ?: "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }
}