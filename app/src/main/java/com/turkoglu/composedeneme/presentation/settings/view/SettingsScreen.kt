package com.turkoglu.composedeneme.presentation.settings.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        Column {


            //CenterText(text = "Settings")

            Text(text = "Sign Out",
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier.clickable {
                    viewModel.saveRememberMeStatus(rememberMe = false)
                    navController.navigate("Login")
                })



        }

    }



}