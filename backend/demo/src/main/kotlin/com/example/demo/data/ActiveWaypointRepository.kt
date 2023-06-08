package com.example.demo.data

import com.example.demo.model.ActiveWaypoint
import org.springframework.data.repository.CrudRepository

interface ActiveWaypointRepository : CrudRepository<ActiveWaypoint, Long> {}