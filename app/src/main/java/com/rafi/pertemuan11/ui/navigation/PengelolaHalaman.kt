package com.rafi.pertemuan11.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.DefaultScaleY
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rafi.pertemuan11.ui.view.DestinasiEntry
import com.rafi.pertemuan11.ui.view.DestinasiHome
import com.rafi.pertemuan11.ui.view.EntryMhsScreen
import com.rafi.pertemuan11.ui.view.HomeScreen

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToltemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick = {
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryMhsScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route){
                        popUpTo(DestinasiHome.route){
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}