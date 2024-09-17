package com.example.demo.service.impl

import com.example.demo.db.MovieRepository
import com.example.demo.exception.MovieNotFoundException
import com.example.demo.mapper.MovieMapper
import com.example.demo.model.dto.GetMovieDto
import com.example.demo.service.MovieService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {

    override fun findMovie(movieId: Long): GetMovieDto {
        val movie = movieRepository.findByIdOrNull(movieId)
        return movie?.let {
            movieMapper.mapToGetMovieDto(it)
        } ?: throw MovieNotFoundException(movieId)

    }

}