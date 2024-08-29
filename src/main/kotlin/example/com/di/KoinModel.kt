package example.com.di

import example.com.data.repository.UsuariosDataSourceImpl
import example.com.domain.repository.UsuariosDataSource
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val KoinModule = module {
    single {
        KMongo.createClient(System.getenv("MONGODB_URI"))
            //KMongo.createClient(System.getenv("MONGODB_URI"))
            .coroutine
            .getDatabase("talentohumanosin_posesio (1)")
    }

    single<UsuariosDataSource> {
        UsuariosDataSourceImpl(get())
    }
}