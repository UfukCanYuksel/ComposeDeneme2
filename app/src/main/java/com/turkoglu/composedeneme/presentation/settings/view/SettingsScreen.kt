package com.turkoglu.composedeneme.presentation.settings.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.turkoglu.composedeneme.presentation.CenterText

@Composable
fun SettingsScreen() {

    Box (modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
    ){
        Column {
            CenterText(text = "Settings")
        }

    }



}