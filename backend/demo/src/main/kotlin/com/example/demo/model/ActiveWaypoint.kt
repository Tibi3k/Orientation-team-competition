package com.example.demo.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
open class ActiveWaypoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    @OneToOne
    open lateinit var waypoint: Waypoint

    open var isVisited: Boolean = false
    open var arrivalTime: LocalDateTime? = null
    open var completionTime: LocalDateTime? = null
}