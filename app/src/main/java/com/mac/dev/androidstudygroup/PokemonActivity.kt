package com.mac.dev.androidstudygroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pokemon.*

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        if(intent.extras != null){
            Glide.with(this).load(intent.getStringExtra("imgURL")).into(photo_view)
        }
    }
}