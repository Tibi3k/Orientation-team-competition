package com.example.demo.data

import com.example.demo.model.Waypoint
import org.springframework.data.repository.CrudRepository

interface WaypointRepository : CrudRepository<Waypoint, Long> {
}