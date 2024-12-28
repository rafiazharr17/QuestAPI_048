package com.rafi.pertemuan11.ui.viewmodel

import com.rafi.pertemuan11.model.Mahasiswa

sealed class HomeuiState{
    data class Success(
        val mahasiswa: List<Mahasiswa>
    ): HomeuiState()
    object Error: HomeuiState()
    object Loading: HomeuiState()
}