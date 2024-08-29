package example.com.domain.model

import java.time.LocalDateTime

data class Persona (
    val id: Int,
    val cedula: String,
    val primer_nombre: String,
    val segundo_nombre: String,
    val tipo_documento: Int,
    val idpais: Int,
    val iddepartamentoexpedicion: Int,
    val idmunicipioexpedicion: Int,
    val fecha_nacimiento: LocalDateTime,
    val idpaisnacimiento: Int,
    val iddepartamentonacimiento: Int,
    val idmunicipionacimiento: Int,
    val nacionalidad: String,
    val direccion: String,
    val telefono: String,
    val idsexo: Int,
    val idestadocivil: Int
)

