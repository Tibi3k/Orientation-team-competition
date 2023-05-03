package com.example.demo.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class ActiveWaypoint(
    @Id
    @GeneratedValue
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waypoint_id")
    val waypoint: Waypoint,

    val isVisited: Boolean,
    val arrivalTime: LocalDateTime?,
    val completionTime: LocalDateTime?,
)