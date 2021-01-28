package com.example.kotlinuser

import java.util.*

object Repository {
    private val _users = mutableListOf<User>()
    val users: List<User>
        get()= _users

    val formattedUserNames: List<String>
        get() {
           return _users.map {user->
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
        _users.add(user1)
        _users.add(user2)
        _users.add(user3)
    }
}