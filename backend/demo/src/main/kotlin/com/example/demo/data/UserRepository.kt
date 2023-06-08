package com.example.demo.data

import com.example.demo.model.Users
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<Users, Long> {
}