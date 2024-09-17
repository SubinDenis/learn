package com.example.demo.service

import com.example.demo.model.dto.GetMovieDto

interface MovieService {
    fun findMovie(movieId: Long): GetMovieDto

}
