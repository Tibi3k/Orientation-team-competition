package com.example.demo.dto

data class RaceDTO(
    val id: String,
    val teams: List<UserGroupDTO>,
    val eventImages: List<ImageDTO>,
    val waypoints: List<WaypointDTO>
)