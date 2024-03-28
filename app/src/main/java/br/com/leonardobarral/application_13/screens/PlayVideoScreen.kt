package br.com.leonardobarral.application_13.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.leonardobarral.application_13.components.ListVideoComponent
import br.com.leonardobarral.application_13.models.PlayVideoModel
import br.com.leonardobarral.application_13.models.VideoPlayer
import br.com.leonardobarral.application_13.repositories.playListRepository


@Composable
fun PlayVideoScreen(playVideoModel: PlayVideoModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {


        val listVideo by playVideoModel.listVideo.observeAsState(initial = playListRepository())
        val videoNow by playVideoModel.videoNow.observeAsState(initial = playListRepository()[0])


        VideoPlayer(video = videoNow!!)
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(150.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//        }

        Spacer(modifier = Modifier.height(5.dp))
        ListVideoComponent(
            listVideo,
            play = {
                playVideoModel.updateVideoNow(it)
            }
        )
    }

}