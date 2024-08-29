package example.com.domain.model

import java.time.LocalDateTime

data class Oficio(
    val idoficio: Int,
    val idoficina: Int,
    val usuario: Int,
    val idconsecutivos: Int,
    val textoificina: String,
    val fechacreacion: LocalDateTime
)
