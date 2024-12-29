package com.rafi.pertemuan11.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.rafi.pertemuan11.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            InsertViewModel(
                aplikasiKontak().container.kontakRepository
            )
        }

        initializer {
            HomeViewModel(
                aplikasiKontak().container.kontakRepository
            )
        }

        initializer {
            DetailViewModel(
                createSavedStateHandle(),
                aplikasiKontak().container.kontakRepository
            )
        }
    }
}

fun CreationExtras.aplikasiKontak(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)