package com.aregyan.github.util
import androidx.room.TypeConverter

class StringConverter {
    @TypeConverter
    fun fromStartString(value: String?): String? {
        return value
    }

    @TypeConverter
    fun toStringValue(value: String?): String? {
        return value
    }
}

