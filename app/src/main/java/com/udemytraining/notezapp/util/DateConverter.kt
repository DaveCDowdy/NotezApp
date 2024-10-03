package com.udemytraining.notezapp.util

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateTimestamp(timestanp: Long): Date? {
        return Date(timestanp)
    }
}