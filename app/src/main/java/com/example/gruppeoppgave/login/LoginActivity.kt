package com.example.gruppeoppgave.login

import android.content.Context
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
              saveToSharedPref()


        }
           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            frontlogo_image.alpha = 0f
            frontlogo_image.animate().setDuration(3000).alpha(1f).withEndAction{
                overridePendingTransition(android.R.anim.fade_out, android.R.anim.fade_in)
            }
        }



  private fun saveToSharedPref() {

        val sharedPreferences =getSharedPreferences(SHARED_PREF_FILE_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(SHARED_PREF_KEY_LOGIN, true)
        editor.commit()
    }
}




