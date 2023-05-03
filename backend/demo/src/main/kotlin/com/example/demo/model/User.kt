package com.example.demo.model

import jakarta.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue
    val id: Long,
    val username: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val phone: String,
    @OneToOne
    val profilePicture: Image,
    @ManyToOne
    val group: UserGroup?
)