package com.example.demo.data

import com.example.demo.model.Image
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ImageRepository : CrudRepository<Image, UUID>