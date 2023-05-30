package com.example.demo.helper

import com.example.demo.dto.ImageDTO
import com.example.demo.model.Image
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

//@Component
//@Mapper(componentModel = "spring")
//interface ImageMapper {
//    fun toDTO(image: Image): ImageDTO
//    fun toEntity(imageDTO: ImageDTO): Image
//
//    companion object {
//        val INSTANCE: ImageMapper = Mappers.getMapper(ImageMapper::class.java)
//
//    }
//}

@Component
@Mapper
interface ImageEntityMapper {
    fun mapToTarget(source: ImageDTO?): Image?
}

@Component
@Mapper
interface ImageDTOMapper {
    fun mapToTarget(source: Image?): ImageDTO?
}
