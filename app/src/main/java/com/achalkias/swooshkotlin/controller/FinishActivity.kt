package com.achalkias.swooshkotlin.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.achalkias.swooshkotlin.R
import com.achalkias.swooshkotlin.utilities.EXTRA_LEAGUE
import com.achalkias.swooshkotlin.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
