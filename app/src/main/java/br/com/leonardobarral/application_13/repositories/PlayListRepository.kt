package br.com.leonardobarral.application_13.repositories

import androidx.compose.runtime.Composable
import br.com.leonardobarral.application_13.models.Video

@Composable
fun playListRepository(): List<Video> {
    return listOf(
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=LD-DtRGL8aY"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=D9HLPqwHcEI"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=EGPItt8_XZc"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=6_nxLxFobR0"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=2ZqqFT_9ki4"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=xmTBH9We6Ms"),
        Video(nome = "Burrão - ", url = "https://www.youtube.com/watch?v=hwkn1Y5PONs"),
    )
}