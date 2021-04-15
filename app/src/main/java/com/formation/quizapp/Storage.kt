package com.formation.quizapp

import android.content.Context
import android.util.Log
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.*

private val TAG = "storage"

fun loadQuestions(context: Context): MutableList<Question>{
    val questions = mutableListOf<Question>()

    val questionsDir = context.filesDir

    for (filename in questionsDir.list()) {
        val note = loadNote(context, filename)
        Log.i(TAG, "Read note : $question")
        questions.add(question)

    }

    return question
}

private fun loadQuestion(context: Context, filename: String): Question {
    val fileInput = context.openFileInput(filename)

    val inputStream = ObjectInputStream(fileInput)

    val question = inputStream.readObject() as Question
    inputStream.close()
    return question
}