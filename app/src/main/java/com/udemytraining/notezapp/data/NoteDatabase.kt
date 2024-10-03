package com.udemytraining.notezapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.udemytraining.notezapp.model.Note
import com.udemytraining.notezapp.util.DateConverter
import com.udemytraining.notezapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter:: class, UUIDConverter:: class)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}