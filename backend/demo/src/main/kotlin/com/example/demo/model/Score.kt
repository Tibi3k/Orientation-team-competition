package com.example.demo.model

import com.example.demo.dto.ActiveWaypointDTO
import jakarta.persistence.*

@Entity
open class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    @ManyToOne
    open lateinit var race: Race
    @OneToOne
    open lateinit var group: UserGroup
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "score_id")
    open var routePoints: MutableList<ActiveWaypoint> = mutableListOf()
}