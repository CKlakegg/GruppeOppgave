package com.example.gruppeoppgave.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pictures")
data class PictureObject (
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val author: String,
    val download_url: String) {
}
