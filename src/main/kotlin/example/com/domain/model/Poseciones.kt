package example.com.domain.model

import java.time.LocalDateTime

data class Poseciones(
    val idpersona: Int,
    val numero: Int,
    val fechaposesion: LocalDateTime,
    val idcargo: String,
    val idcodigo: String,
    val idplanta: String,
    val idoficinaadscrita: String,
    val idtipovinculacion: String,
    val fecha_acto_administrativa: LocalDateTime,
    val idtipo_acto_administrativo: String,
    val acto_administrativo: String,
    val idclase: String,
    val idsituacionadministrativa: String,
    val cabildo: String,
    val ubicacioncabildo: String,
    val fechaasamblea: String
)

