package com.example.demo.mapper

import com.example.demo.model.dto.GetMovieDto
import com.example.demo.model.entity.MovieEntity

class MovieMapper {
    fun mapToGetMovieDto(movie: MovieEntity): GetMovieDto {
        return GetMovieDto(
            id = movie.id,
            title = movie.title,
            filmedAt = movie.filmedAt,
            producer = movie.producer
        )
    }

}
