package com.example.demo.dto

data class UserGroupDTO(
    val id: String,
    val groupName: String,
    val leaderId: String,
    val raceId: String,
    val users: List<UserDTO>,
    val score: ScoreDTO
)