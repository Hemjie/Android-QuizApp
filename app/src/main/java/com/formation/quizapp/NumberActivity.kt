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
            intent.action = Intent.ACTION_VIEW
        }

        val btn10: Button = findViewById(R.id.nb_btn_10)
        val btn15: Button = findViewById(R.id.nb_btn_15)
        val btn20: Button = findViewById(R.id.nb_btn_20)
    }

    /*override fun onClick(v: View) {
            val btn5 = findViewById<Button>(R.id.nb_btn_5)
            Log.i("NumberActivity", "${btn5.text}")
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)

    }*/

}