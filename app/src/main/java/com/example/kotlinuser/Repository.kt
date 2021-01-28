package com.example.kotlinuser

import java.util.*

object Repository {
    private val users = mutableListOf<User>()
    fun getUsers(): List<User>? {
        return users
    }

    val formattedUserNames: List<String>
        get() {
           return users.map {user->
               if(user.lastName != null){
                   if (user.firstName != null){
                       "${user.firstName} ${user.lastName}"
                   } else{
                       user.lastName ?: "Unknown"
                   }
               } else {
                   user.firstName ?: "Unknown"
               }
           }
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