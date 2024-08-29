package example.com.data.repository

import example.com.domain.model.Usuarios
import example.com.domain.repository.UsuariosDataSource
import org.litote.kmongo.coroutine.CoroutineDatabase

class UsuariosDataSourceImpl(
    database: CoroutineDatabase
): UsuariosDataSource {
    override suspend fun getUsuarioById(id: String): Usuarios? {
        TODO("Not yet implemented")
    }

    override suspend fun getUsuarioByEmail(email: String): Usuarios? {
        TODO("Not yet implemented")
    }
}