package com.formation.quizapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

    lateinit var nicknameEditText: EditText
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        sharedPreferences = getSharedPreferences("User", Context.MODE_PRIVATE)

        nicknameEditText = findViewById(R.id.edit_nickname)

        nicknameEditText.hint = getNicknameSharedPreference()

        val btnSend: Button = findViewById(R.id.btn_send)

        btnSend.setOnClickListener{
            if (nicknameEditText.length() in 3..10) {
                val intent = Intent(this, NumberActivity::class.java)
                intent.action = Intent.ACTION_VIEW
                startActivity(intent)
            } else {
                Toast.makeText(this, "Pseudo entre 3 à 10 caractères", Toast.LENGTH_LONG).show()
            }
        }
        
    }

    private fun getNicknameSharedPreference(): String? {
        return sharedPreferences.getString("nickname", "")
    }

    private fun setNicknameSharedPreference(nickname: String) {
        val editor = sharedPreferences.edit()
        editor.putString("nickname", nickname)
        editor.apply()
    }
}