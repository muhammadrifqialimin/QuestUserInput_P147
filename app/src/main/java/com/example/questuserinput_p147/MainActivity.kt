package com.example.questuserinput_p147

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questuserinput_p147.ui.theme.QuestUserInput_P147Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestUserInput_P147Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormData(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
