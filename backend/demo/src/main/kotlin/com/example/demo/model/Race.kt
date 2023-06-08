package com.example.demo.model

import com.example.demo.dto.ImageDTO
import com.example.demo.dto.UserGroupDTO
import com.example.demo.dto.WaypointDTO
import jakarta.persistence.*

@Entity
open class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    open var teams: MutableList<UserGroup> = mutableListOf()

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    open var eventImages: MutableList<Image> = mutableListOf()

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    open var waypoints: MutableList<Waypoint> = mutableListOf()

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "race_id")
    open var scores: MutableList<Score> = mutableListOf()
}