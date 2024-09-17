package com.example.demo.http

import com.example.demo.model.dto.AddMovieDto
import com.example.demo.model.dto.GetMovieDto
import com.example.demo.service.MovieService
import mu.KotlinLogging
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movie")
class MovieController(
    val movieService: MovieService
) {

    @GetMapping("/{id}")
    fun getMovie(@PathVariable movieId: Long): GetMovieDto {
        log.info { "Handle getMovie request for id $movieId" }
        return movieService.findMovie(movieId)
    }

    @PostMapping
    fun addMovie(movieDto: AddMovieDto) {

    }

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable movieId: Long) {

    }

    @GetMapping
    fun getAllMovies() {

    }

    companion object {
        private val log = KotlinLogging.logger {}
    }
}