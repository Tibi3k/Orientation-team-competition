package com.example.demo.data

import com.example.demo.model.UserGroup
import org.springframework.data.repository.CrudRepository

interface UserGroupRepository : CrudRepository<UserGroup, Long> {
}