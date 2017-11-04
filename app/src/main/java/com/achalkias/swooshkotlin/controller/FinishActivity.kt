package com.achalkias.swooshkotlin.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.achalkias.swooshkotlin.R
import com.achalkias.swooshkotlin.model.Player
import com.achalkias.swooshkotlin.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
