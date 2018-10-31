package com.android.richa.alucross

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun startGame(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
