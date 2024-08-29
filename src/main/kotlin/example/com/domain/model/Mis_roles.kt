package example.com.domain.model

import java.time.LocalDateTime

data class Mis_roles(
    val rol: Int,
    val usuario: Int,
    val fecha_asignacion: LocalDateTime
)
