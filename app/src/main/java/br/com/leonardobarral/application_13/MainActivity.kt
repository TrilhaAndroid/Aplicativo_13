package br.com.leonardobarral.application_13

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.leonardobarral.application_13.models.PlayVideoModel
import br.com.leonardobarral.application_13.screens.PlayVideoScreen
import br.com.leonardobarral.application_13.ui.theme.Application_13Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application_13Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlayVideoScreen(PlayVideoModel())
                }
            }
        }
    }
}

