package br.com.leonardobarral.application_13.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayVideoModel : ViewModel() {


    private val _listVideo = MutableLiveData<List<Video>>()
    val listVideo: LiveData<List<Video>> = _listVideo

    fun updateListVideo(novoValor: List<Video>) {
        _listVideo.value = novoValor
    }


    private val _videoNow = MutableLiveData<Video>()
    val videoNow: MutableLiveData<Video> = _videoNow

    fun updateVideoNow(novoValor: Video?) {
        _videoNow.value = novoValor!!
    }

}