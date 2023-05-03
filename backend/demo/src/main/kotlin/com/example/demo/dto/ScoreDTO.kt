package com.example.demo.dto

data class ScoreDTO(
    val id: String,
    val raceId: String,
    val groupId: String,
    val routePoints: List<ActiveWaypointDTO>
)