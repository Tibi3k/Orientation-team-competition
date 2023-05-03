package com.example.demo.model

import com.example.demo.dto.ImageDTO
import com.example.demo.dto.UserGroupDTO
import com.example.demo.dto.WaypointDTO
import jakarta.persistence.*

@Entity
data class Race(
    @Id
    @GeneratedValue
    val id: Long,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    val teams: List<UserGroup>,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    val eventImages: List<Image>,
    val waypoints: List<Waypoint>,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    val scores: List<Score>
)