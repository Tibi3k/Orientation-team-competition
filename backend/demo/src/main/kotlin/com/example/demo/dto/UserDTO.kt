package com.example.demo.dto

data class UserDTO(
    val id: String,
    val username: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val phone: String,
    val profilePicture: ImageDTO
)