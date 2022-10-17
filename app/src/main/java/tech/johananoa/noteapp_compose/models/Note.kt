package tech.johananoa.noteapp_compose.models

import java.util.UUID
import java.util.Date


data class Note(
    val id: UUID = UUID.randomUUID(),
    val title:String,
    val description:String,
    val entryDate: Date
)
