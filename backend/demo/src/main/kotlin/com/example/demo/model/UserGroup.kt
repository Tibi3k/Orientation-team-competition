package com.example.demo.model

import jakarta.persistence.*

@Entity
open class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    open var groupName: String = ""

    @OneToOne
    open lateinit var leader: Users

    @ManyToOne
    open lateinit var race: Race

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "group_id")
    open var users: MutableList<Users> = mutableListOf()

    @OneToOne
    open lateinit var score: Score
}