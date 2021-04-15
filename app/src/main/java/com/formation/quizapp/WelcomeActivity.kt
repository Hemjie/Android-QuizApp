package com.formation.quizapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

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
            val intent = Intent(this, NumberActivity::class.java)
            intent.action = Intent.ACTION_VIEW

            startActivity(intent)
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