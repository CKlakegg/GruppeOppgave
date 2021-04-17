package com.example.gruppeoppgave.database

import androidx.room.*

@Dao
interface PicturesDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addItem(pictureObject: PictureObject)

    @Delete
    fun deleteItem(pictureObject: PictureObject)

    @Query("SELECT * FROM pictures")
    fun getAllItems(): List<PictureObject>
}