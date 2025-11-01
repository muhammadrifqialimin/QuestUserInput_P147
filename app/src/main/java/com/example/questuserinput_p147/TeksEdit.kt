package com.example.questuserinput_p147

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun FormData(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textNikah by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var nikah by remember { mutableStateOf("") }

    val gender = listOf("Laki-Laki", "Perempuan")
    val status = listOf("Janda", "Lajang", "Duda")
    val purple = Color(0xFF8A2BE2)
    val purpleDark = Color(0xFF6A1FBF)


