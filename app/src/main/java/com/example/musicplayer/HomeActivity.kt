package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        add_fragment(MusicFragment())
        music_image.setOnClickListener {
            add_fragment(MusicFragment())
        }
        fav_image.setOnClickListener {
            add_fragment(FavouritFragment())
        }
        playlist_image.setOnClickListener {
            add_fragment(PlaylistFragment())
        }


    }

    private fun add_fragment(fragment: Fragment)
    {
        var transation = supportFragmentManager.beginTransaction()
        transation.replace(R.id.pager,fragment)
        transation.commit()
    }

}