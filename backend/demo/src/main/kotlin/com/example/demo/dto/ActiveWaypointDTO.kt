package com.example.demo.dto

data class ActiveWaypointDTO(
    val latitude: Double,
    val longitude: Double,
    val estimatedTime: String?,
    val reachedTime: String?
)