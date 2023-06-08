package com.example.demo.dto

class ScoreDTO {
    val id: Long = 0
    val raceId: Long = 0
    val groupId: Long = 0
    val routePoints: MutableList<ActiveWaypointDTO> = mutableListOf()
}