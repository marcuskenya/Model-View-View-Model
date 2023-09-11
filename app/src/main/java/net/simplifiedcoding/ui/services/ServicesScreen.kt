package net.simplifiedcoding.ui.services

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun ServicesScreen(viewModel: AuthViewModel?, navController: NavHostController) {
Column (
    modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
){
    Text(text = "This is the Services Page.",color= Color.White)
}

}