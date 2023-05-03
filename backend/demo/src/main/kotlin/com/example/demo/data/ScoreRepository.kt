package com.example.demo.data

import com.example.demo.model.Score
import org.springframework.data.repository.CrudRepository

interface ScoreRepository : CrudRepository<Score, Long> { }