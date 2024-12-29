package com.rafi.pertemuan11.ui.viewmodel

import com.rafi.pertemuan11.model.Mahasiswa

sealed class DetailUiState {
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
    object Loading : DetailUiState()
}