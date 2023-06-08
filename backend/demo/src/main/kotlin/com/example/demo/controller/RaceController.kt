package com.example.demo.controller

import com.example.demo.data.RaceRepository
import com.example.demo.dto.RaceDTO
//import com.example.demo.helper.RaceDTOMapper
//import com.example.demo.helper.RaceEntityMapper
import jakarta.persistence.EntityNotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//@RestController
//@RequestMapping("/races")
//class RaceController(
//    private val raceRepository: RaceRepository,
//    private val raceEntityMapper: RaceEntityMapper,
//    private val raceDTOMapper: RaceDTOMapper
//) {
//    @PostMapping
//    fun createRace(@RequestBody raceDTO: RaceDTO): ResponseEntity<RaceDTO> {
//        val raceEntity = raceEntityMapper.mapToTarget(raceDTO) ?: throw EntityNotFoundException("Race not found")
//        val savedRaceEntity = raceRepository.save(raceEntity)
//        val savedRaceDTO = raceDTOMapper.mapToTarget(savedRaceEntity)
//        return ResponseEntity.ok(savedRaceDTO)
//    }
//
//    @GetMapping
//    fun getAllRaces(): ResponseEntity<List<RaceDTO?>> {
//        val raceEntities = raceRepository.findAll()
//        val raceDTOs = raceEntities.map { raceDTOMapper.mapToTarget(it) }
//        return ResponseEntity.ok(raceDTOs)
//    }
//
//    @GetMapping("/{id}")
//    fun getRace(@PathVariable id: Long): ResponseEntity<RaceDTO> {
//        val raceEntity = raceRepository.findById(id).orElseThrow { EntityNotFoundException("Race not found") }
//        val raceDTO = raceDTOMapper.mapToTarget(raceEntity)
//        return ResponseEntity.ok(raceDTO)
//    }
//
//    @PutMapping("/{id}")
//    fun updateRace(@PathVariable id: Long, @RequestBody raceDTO: RaceDTO): ResponseEntity<RaceDTO> {
//        val raceEntity = raceRepository.findById(id).orElseThrow { EntityNotFoundException("Race not found") }
//        // Update the raceEntity using raceDTO as needed
//        val savedRaceEntity = raceRepository.save(raceEntity)
//        val savedRaceDTO = raceDTOMapper.mapToTarget(savedRaceEntity)
//        return ResponseEntity.ok(savedRaceDTO)
//    }
//
//    @DeleteMapping("/{id}")
//    fun deleteRace(@PathVariable id: Long): ResponseEntity<Unit> {
//        raceRepository.deleteById(id)
//        return ResponseEntity.noContent().build()
//    }
//}