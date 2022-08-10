package com.caglar.kidsapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Colors : AppCompatActivity() {
    var mMediaPlayer: MediaPlayer? = null
    var mMediaPlayer2: MediaPlayer? = null
    var mMediaPlayer3: MediaPlayer? = null
    var mMediaPlayer4: MediaPlayer? = null
    var mMediaPlayer5: MediaPlayer? = null
    var mMediaPlayer6: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        val colorbutton = findViewById<ImageButton>(R.id.imageButton)
        val colorbutton2 = findViewById<ImageButton>(R.id.imageButton4)
        val colorbutton3 = findViewById<ImageButton>(R.id.imageButton5)
        val colorbutton4 = findViewById<ImageButton>(R.id.imageButton6)
        val colorbutton5 = findViewById<ImageButton>(R.id.imageButton13)
        val colorbutton6 = findViewById<ImageButton>(R.id.imageButton14)

        colorbutton.setOnClickListener {
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.red)

                mMediaPlayer!!.start()
            }else mMediaPlayer!!.start()
        }
        colorbutton2.setOnClickListener {
            if (mMediaPlayer2 == null) {
                mMediaPlayer2 = MediaPlayer.create(this, R.raw.orange)

                mMediaPlayer2!!.start()
            }else mMediaPlayer2!!.start()
        }
        colorbutton3.setOnClickListener {
            if (mMediaPlayer3 == null) {
                mMediaPlayer3 = MediaPlayer.create(this, R.raw.yellow)

                mMediaPlayer3!!.start()
            }else mMediaPlayer3!!.start()
        }
        colorbutton4.setOnClickListener {
            if (mMediaPlayer4 == null) {
                mMediaPlayer4 = MediaPlayer.create(this, R.raw.blue)

                mMediaPlayer4!!.start()
            }else mMediaPlayer4!!.start()
        }
        colorbutton5.setOnClickListener {
            if (mMediaPlayer5 == null) {
                mMediaPlayer5 = MediaPlayer.create(this, R.raw.green)

                mMediaPlayer5!!.start()
            }else mMediaPlayer5!!.start()
        }
        colorbutton6.setOnClickListener {
            if (mMediaPlayer6 == null) {
                mMediaPlayer6 = MediaPlayer.create(this, R.raw.black)

                mMediaPlayer6!!.start()
            }else mMediaPlayer6!!.start()
        }


    }
}