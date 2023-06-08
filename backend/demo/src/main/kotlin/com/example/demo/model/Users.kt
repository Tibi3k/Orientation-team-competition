package com.example.demo.model

import jakarta.persistence.*

@Entity
open class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Long = 0
    open var username: String = ""
    open var firstName: String = ""
    open var lastName: String = ""
    open var email: String = ""
    open var password: String = ""
    open var phone: String = ""

    @OneToOne(optional = true)
    open var profilePicture: Image? = null

    @ManyToOne
    open lateinit var group: UserGroup
}