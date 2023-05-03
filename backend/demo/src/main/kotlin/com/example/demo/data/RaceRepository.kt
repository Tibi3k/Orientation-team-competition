package com.example.demo.data

import com.example.demo.model.Race
import org.springframework.data.repository.CrudRepository

interface RaceRepository : CrudRepository<Race, Long> { }