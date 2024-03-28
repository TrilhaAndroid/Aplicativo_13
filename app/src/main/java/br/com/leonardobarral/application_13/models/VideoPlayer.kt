package br.com.leonardobarral.application_13.models

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView

@Composable
fun VideoPlayer(video: Video) {
    val context = LocalContext.current
    val player = ExoPlayer.Builder(context).build()
    val playerView = PlayerView(context)
    val mediaItem = MediaItem.fromUri(video.url)

    val playWhenReay by remember {
        mutableStateOf(true)
    }

    player.setMediaItem(mediaItem)
    playerView.player = player

    LaunchedEffect(player) {
        player.prepare()
        player.playWhenReady = playWhenReay
    }

    AndroidView(factory = {
        playerView
    })


}