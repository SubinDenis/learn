package com.example.demo.http

import com.example.demo.dto.AddMovieDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movie")
class MovieController {

    @GetMapping("/{id}")
    fun getMovie(@PathVariable movieId: Long) {

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
}