package com.example.demo.helper

import com.example.demo.dto.ImageDTO
import com.example.demo.model.Image
import org.mapstruct.Mapper
import org.mapstruct.MappingTarget
import org.springframework.stereotype.Component

@Component
@Mapper(componentModel = "spring")
interface ImageMapper {
    fun toDTO(image: Image): ImageDTO
    fun toEntity(imageDTO: ImageDTO): Image
}