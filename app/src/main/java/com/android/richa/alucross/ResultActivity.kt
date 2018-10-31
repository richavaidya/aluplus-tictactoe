package com.android.richa.alucross

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }

    fun startGame(){
        val intent = Intent(this, MainActivity::class.java)
        this.startActivity(intent)
        this.finishAffinity()
    }
}
