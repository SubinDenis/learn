package com.example.demo.exception

class MovieNotFoundException(movieId: Long) : Exception("Movie with id $movieId not found")
