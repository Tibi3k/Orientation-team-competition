package com.example.demo.model

import com.example.demo.dto.ActiveWaypointDTO
import jakarta.persistence.*

@Entity
data class Score(
    @Id
    @GeneratedValue
    val id: Long,
    @ManyToOne
    val race: Race,
    @OneToOne
    val group: UserGroup,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "score_id")
    val routePoints: List<ActiveWaypoint> = emptyList(),
    )