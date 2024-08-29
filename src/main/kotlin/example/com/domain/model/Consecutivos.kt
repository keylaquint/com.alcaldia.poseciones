package example.com.domain.model

import java.time.LocalDateTime

data class Consecutivos(
    val idconsecutivos: Int,
    val usuario:  Int,
    val idoficinaadscrista: Int,
    val consecutivos: Int,
    val mes: String,
    val ano: String,
    val estado: String,
    val fecha: LocalDateTime
)
