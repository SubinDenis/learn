package com.example.demo.db

import com.example.demo.model.entity.MovieEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepository : JpaRepository<MovieEntity, Long> {
}