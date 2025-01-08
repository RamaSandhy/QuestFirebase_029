package com.example.pertemuan14.repository

import com.example.pertemuan14.Model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {

        suspend fun insertMhs(mahasiswa: Mahasiswa)

        fun getAllMhs(): Flow<List<Mahasiswa>>

        fun getMhs (nim: String): Flow<Mahasiswa>

        suspend fun deleteMhs(mahasiswa: Mahasiswa)

        suspend fun updateMhs(mahasiswa: Mahasiswa)
}