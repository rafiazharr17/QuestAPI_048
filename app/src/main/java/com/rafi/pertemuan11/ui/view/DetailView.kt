package com.rafi.pertemuan11.ui.view

import com.rafi.pertemuan11.ui.navigation.DestinasiNavigasi

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = "Detail Mhs"
    const val NIM = "nim"
    val routeWithArg = "$route/{$NIM}"
}