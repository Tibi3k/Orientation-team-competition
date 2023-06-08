package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
open class Waypoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0

    open var latitude: Double = 0.0
    open var longitude: Double = 0.0
    open var name: String = ""
}