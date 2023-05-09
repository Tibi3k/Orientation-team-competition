package com.example.demo.model

import jakarta.persistence.*

@Entity
data class UserGroup(
    @Id
    @GeneratedValue
    val id: Long,
    val groupName: String,
    @ManyToOne
    val leader: User,
    @ManyToOne
    val race: Race,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "group_id")
    val users: List<User>,
    @OneToOne
    val score: Score
)