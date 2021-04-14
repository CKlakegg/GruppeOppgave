package com.example.gruppeoppgave


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gruppeoppgave.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val userIsLoggedIn = false
         val activityIntent= if (userIsLoggedIn) {
             Intent (this, MainActivity:: class.java)

        } else {
            Intent (this,LoginActivity:: class.java)

        }

        startActivity(activityIntent)


    }
}