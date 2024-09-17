package com.example.demo.model.dto

import java.time.Instant

class AddMovieDto (
    val title: String,
    val filmedAt: Instant,
    val producer: String
)
