package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Waypoint(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val latitude: Double,
    val longitude: Double,
    val name: String,
)