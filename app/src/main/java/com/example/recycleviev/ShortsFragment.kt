package com.example.recycleviev

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.recycleviev.R

class ShortsFragment : Fragment() {
    private lateinit var videoView: VideoView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.shorts_fragment, container, false)

        videoView = view.findViewById(R.id.videoView)
        val uri = Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.video1)
        videoView.setVideoURI(uri)
        videoView.start()

        videoView.setOnPreparedListener { mp ->
            mp.isLooping = true
        }

        return view
    }

    override fun onResume() {
        super.onResume()
        videoView.resume()
    }

    override fun onPause() {
        super.onPause()
        videoView.suspend()
    }

    override fun onDestroy() {
        super.onDestroy()
        videoView.stopPlayback()
    }
}
