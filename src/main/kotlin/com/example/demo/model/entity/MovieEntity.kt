package com.example.demo.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "movie")
class MovieEntity(
    @Id
    @Column
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val filmedAt: Instant,

    @Column(nullable = false)
    val producer: String,

    @Column(nullable = false)
    val createdAt: Instant,

    @Column(nullable = false)
    val updatedAt: Instant
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MovieEntity

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String {
        return "MovieEntity(" +
                "id=$id, " +
                "title='$title', " +
                "filmedAt=$filmedAt, " +
                "createdAt=$createdAt, " +
                "updatedAt=$updatedAt" +
                ")"
    }


}