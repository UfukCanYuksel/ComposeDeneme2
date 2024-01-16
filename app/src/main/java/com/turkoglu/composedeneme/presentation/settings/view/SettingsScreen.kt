package com.turkoglu.composedeneme.presentation.settings.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.turkoglu.composedeneme.presentation.CenterText
import com.turkoglu.composedeneme.presentation.login.LoginViewModel

@Composable
fun SettingsScreen(
    navController : NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {

    Box (modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp), // Sayfa kenarlarından padding
            horizontalArrangement = Arrangement.SpaceBetween) {

            Text(
                text = "Settings",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 28.sp
            )

            Text(text = "Sign Out",
                color = Color.Red,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 6.dp)
                    .clickable {
                        viewModel.saveRememberMeStatus(rememberMe = false)
                        navController.navigate("Login")
                    })



        }
    }
}