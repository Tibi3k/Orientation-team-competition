package com.example.demo.model

import jakarta.persistence.*
import java.util.UUID

@Entity
open class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    open var name: String = ""
    open var imageType: String = ""
    open var imagePath: String = ""

    @ManyToOne
    open lateinit var race: Race
}