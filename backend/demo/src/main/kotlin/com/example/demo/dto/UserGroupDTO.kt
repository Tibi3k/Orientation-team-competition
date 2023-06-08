package com.example.demo.dto

class UserGroupDTO {
    val id: Long = 0
    val groupName: String = ""
    val leaderId: String = ""
    val raceId: String = ""
    val users: MutableList<UserDTO> = mutableListOf()
    var score: ScoreDTO? = null
}