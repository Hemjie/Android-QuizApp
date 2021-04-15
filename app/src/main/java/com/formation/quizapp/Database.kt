package com.formation.quizapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database(context: Context): SQLiteOpenHelper(context, "quiz_prod.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

    fun findAll(): MutableList<Question> {
        val notes = mutableListOf<Question>()

        val cursor = readableDatabase.rawQuery("SELECT * FROM question", null)

        while(cursor.moveToNext()){
            val question = Question(
                cursor.getString(cursor.getColumnIndex("title")),
                cursor.getString(cursor.getColumnIndex("description"))
            )
            questions.add(question)
        }
        cursor.close()
        return questions
    }

}