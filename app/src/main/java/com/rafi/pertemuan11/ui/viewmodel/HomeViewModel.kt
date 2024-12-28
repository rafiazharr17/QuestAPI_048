package com.rafi.pertemuan11.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.rafi.pertemuan11.model.Mahasiswa
import com.rafi.pertemuan11.repository.MahasiswaRepository

sealed class HomeuiState{
    data class Success(
        val mahasiswa: List<Mahasiswa>
    ): HomeuiState()
    object Error: HomeuiState()
    object Loading: HomeuiState()
}

class HomeViewModel(
    private val mhs: MahasiswaRepository
): ViewModel(){

}