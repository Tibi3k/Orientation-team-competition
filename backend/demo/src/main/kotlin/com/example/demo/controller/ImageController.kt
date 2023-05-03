package com.example.demo.controller

import com.example.demo.data.ImageRepository
import com.example.demo.dto.ImageDTO
import com.example.demo.helper.ImageMapper
import jakarta.persistence.EntityNotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/images")
class ImageController(private val imageRepository: ImageRepository, private val imageMapper: ImageMapper) {

    @PostMapping
    fun createImage(@RequestBody imageDTO: ImageDTO): ResponseEntity<ImageDTO> {
        val imageEntity = imageMapper.toEntity(imageDTO) ?: throw EntityNotFoundException("Image not found")
        val savedImageEntity = imageRepository.save(imageEntity)
        val savedImageDTO = imageMapper.toDTO(savedImageEntity)
        return ResponseEntity.ok(savedImageDTO)
    }

    @GetMapping()
    fun getAllImages(): ResponseEntity<List<ImageDTO?>> {
        val imageEntity = imageRepository.findAll();
        val imageDTO = imageEntity.map { imageMapper.toDTO(it) }
        return ResponseEntity.ok(imageDTO)
    }


    @GetMapping("/{id}")
    fun getImage(@PathVariable id: UUID): ResponseEntity<ImageDTO> {
        val imageEntity = imageRepository.findById(id).orElseThrow { EntityNotFoundException("Image not found") }
        val imageDTO = imageMapper.toDTO(imageEntity)
        return ResponseEntity.ok(imageDTO)
    }

    @PutMapping("/{id}")
    fun updateImage(@PathVariable id: UUID, @RequestBody imageDTO: ImageDTO): ResponseEntity<ImageDTO> {
        val imageEntity = imageRepository.findById(id).orElseThrow { EntityNotFoundException("Image not found") }
       // imageMapper.updateEntityFromDTO(imageDTO, imageEntity)
        val savedImageEntity = imageRepository.save(imageEntity)
        val savedImageDTO = imageMapper.toDTO(savedImageEntity)
        return ResponseEntity.ok(savedImageDTO)
    }

    @DeleteMapping("/{id}")
    fun deleteImage(@PathVariable id: UUID): ResponseEntity<Unit> {
        imageRepository.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}