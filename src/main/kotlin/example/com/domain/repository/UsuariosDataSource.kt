package example.com.domain.repository

import example.com.domain.model.Usuarios

interface UsuariosDataSource {
    suspend fun getUsuarioById(id:String):Usuarios?
    suspend fun getUsuarioByEmail(email:String):Usuarios?
}