package com.caglar.kidsapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    var mMediaPlayer: MediaPlayer? = null
    var mMediaPlayer2: MediaPlayer? = null
    var mMediaPlayer3: MediaPlayer? = null
    var mMediaPlayer4: MediaPlayer? = null
    var mMediaPlayer5: MediaPlayer? = null
    var mMediaPlayer6: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundbutton = findViewById<ImageButton>(R.id.ImageButton)
        val soundbutton2 = findViewById<ImageButton>(R.id.ImageButton2)
        val soundbutton3 = findViewById<ImageButton>(R.id.imageButton2)
        val soundbutton4 = findViewById<ImageButton>(R.id.imageButton3)
        val soundbutton5 = findViewById<ImageButton>(R.id.ImageButton5)
        val soundbutton6 = findViewById<ImageButton>(R.id.ImageButton6)

        soundbutton.setOnClickListener {
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.colors)

                mMediaPlayer!!.start()
            }else mMediaPlayer!!.start()
        }
        soundbutton2.setOnClickListener {
            if (mMediaPlayer2 == null) {
                mMediaPlayer2 = MediaPlayer.create(this, R.raw.numbers)

                mMediaPlayer2!!.start()
            }else mMediaPlayer2!!.start()

        }
        soundbutton3.setOnClickListener {
            if (mMediaPlayer3 == null) {
                mMediaPlayer3 = MediaPlayer.create(this, R.raw.animals)

                mMediaPlayer3!!.start()
            }else mMediaPlayer3!!.start()

        }
        soundbutton4.setOnClickListener {
            if (mMediaPlayer4 == null) {
                mMediaPlayer4 = MediaPlayer.create(this, R.raw.fruits)

                mMediaPlayer4!!.start()
            }else mMediaPlayer4!!.start()

        }
        soundbutton5.setOnClickListener {
            if (mMediaPlayer5 == null) {
                mMediaPlayer5 = MediaPlayer.create(this, R.raw.vegetables)

                mMediaPlayer5!!.start()
            }else mMediaPlayer5!!.start()

        }
        soundbutton6.setOnClickListener {
            if (mMediaPlayer6 == null) {
                mMediaPlayer6 = MediaPlayer.create(this, R.raw.apparels)

                mMediaPlayer6!!.start()
            }else mMediaPlayer6!!.start()

        }
    }
    fun change(view: View){
        val intent = Intent(applicationContext,Colors::class.java)
        startActivity(intent)

    }
    /*fun play(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.colors)

            mMediaPlayer!!.start()
        } 
    }
    fun play2(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.numbers)

            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }
    fun play3(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.animals)

            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }
    fun play4(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.fruits)

            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }
    fun play5(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.vegetables)

            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }
    fun play6(view: View){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.apparels)

            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }*/



}