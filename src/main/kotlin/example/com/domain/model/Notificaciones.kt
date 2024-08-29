package example.com.domain.model

import java.time.LocalDateTime

data class Notificaciones(
    val idnotificaciones: Int,
    val fechaFinal: LocalDateTime,
    val titulo: String
)
