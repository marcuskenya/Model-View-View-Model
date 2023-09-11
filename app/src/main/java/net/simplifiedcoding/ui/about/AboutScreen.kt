package net.simplifiedcoding.ui.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun AboutScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize(),
    ) {
Text(text = "This is the About Page.")
    }
}