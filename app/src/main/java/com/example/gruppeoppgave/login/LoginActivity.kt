package com.example.gruppeoppgave.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gruppeoppgave.MainActivity
import com.example.gruppeoppgave.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        welcome_button.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
            startActivity((intent))
        }

    }
}