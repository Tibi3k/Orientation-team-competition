package com.example.demo.dto

class RaceDTO {
    val id: Long = 0
    val teams: MutableList<UserGroupDTO> = mutableListOf()
    val eventImages: MutableList<ImageDTO> = mutableListOf()
    val waypoints: MutableList<WaypointDTO> = mutableListOf()
}