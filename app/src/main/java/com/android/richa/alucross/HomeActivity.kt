package com.android.richa.alucross

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        konfetti_view.build()
            .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.RECT, Shape.CIRCLE)
            .addSizes(Size(12))
            .setPosition(-50f, konfetti_view.width + 50f, -50f, -50f)
            .streamFor(300, 5000L)
    }

    fun startGame(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
