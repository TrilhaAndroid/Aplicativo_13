package br.com.leonardobarral.application_13.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.leonardobarral.application_13.models.Video

@Composable
fun CardListVideo(
    video: Video,
    play: (Video) -> Unit
) {

    Card(
        modifier = Modifier.clickable {
            play(video)
        }
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = video.nome,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color(0xFF314561)
            )
        }
    }
}