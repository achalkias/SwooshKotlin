package com.achalkias.swooshkotlin.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.achalkias.swooshkotlin.utilities.EXTRA_LEAGUE
import com.achalkias.swooshkotlin.R
import com.achalkias.swooshkotlin.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""

    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBallerClick(view: View) {
        begginerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "begginer"
    }


    fun onSkillFinishedClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, getString(R.string.skill_error), Toast.LENGTH_SHORT).show()
        }
    }



}
