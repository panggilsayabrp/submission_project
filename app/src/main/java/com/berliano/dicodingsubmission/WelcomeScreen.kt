package com.berliano.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val btnMoveActivityToMainScreen: Button = findViewById(R.id.welcome_button_one)
        btnMoveActivityToMainScreen.setOnClickListener(this)

        val btnMoveActivityToAboutScreen: Button = findViewById(R.id.welcome_button_two)
        btnMoveActivityToAboutScreen.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.welcome_button_one -> {
              val moveIntentToMainScreen = Intent(this, MainActivity::class.java)
                startActivity(moveIntentToMainScreen)
            }
            R.id.welcome_button_two -> {
                val moveIntentToAboutScreen = Intent(this, AboutActivity::class.java)
                startActivity(moveIntentToAboutScreen)
            }
        }
    }

}