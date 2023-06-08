package com.example.demo.helper

import com.example.demo.dto.*
import com.example.demo.model.*
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ReportingPolicy
import org.springframework.stereotype.Component

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ImageEntityMapper {
    fun mapToTarget(source: ImageDTO?): Image?
}

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ImageDTOMapper {
    fun mapToTarget(source: Image?): ImageDTO?
}

//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface RaceDTOMapper {
//    fun mapToTarget(source: Race?): RaceDTO?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface RaceEntityMapper {
//    fun mapToTarget(source: RaceDTO?): Race?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface WaypointDTOMapper {
//    fun mapToTarget(source: Waypoint?): WaypointDTO?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface WaypointEntityMapper {
//    fun mapToTarget(source: WaypointDTO?): Waypoint?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface UserGroupDTOMapper {
//    fun mapToTarget(source: UserGroup?): UserGroupDTO?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface UserGroupEntityMapper {
//    fun mapToTarget(source: UserGroupDTO?): UserGroup?
//}
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface UserDTOMapper {
//    fun mapToTarget(source: Users?): UserDTO?
//}
//
//
//@Component
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//interface UserEntityMapper{
//    fun mapToTarget(source: UserDTO?): Users?
//}


