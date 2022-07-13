package com.example.noteapp.feature_note.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timetamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightBlue, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
