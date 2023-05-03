package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity
public data class Image(
    @Id
    @GeneratedValue
    val id: Long?,
    val name: String?,
    val imageType: String?,
    val imagePath: String?,
    @ManyToOne
    val race: Race
)