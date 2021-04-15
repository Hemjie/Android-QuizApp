package com.formation.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class NumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        val btn5 = findViewById<Button>(R.id.nb_btn_5)
        Log.i("NumberActivity", "${btn5.text}")

        btn5.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("nbQuestions", btn5.text)
            intent.action = Intent.ACTION_VIEW
            startActivity(intent)
        }

        val btn10 = findViewById<Button>(R.id.nb_btn_10)

        btn10.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("nbQuestions", btn10.text)
            intent.action = Intent.ACTION_VIEW
            startActivity(intent)
        }

        val btn15 = findViewById<Button>(R.id.nb_btn_15)

        btn15.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("nbQuestions", btn15.text)
            intent.action = Intent.ACTION_VIEW
            startActivity(intent)
        }

        val btn20 = findViewById<Button>(R.id.nb_btn_20)

        btn20.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("nbQuestions", btn20.text)
            intent.action = Intent.ACTION_VIEW
            startActivity(intent)
        }
    }

}