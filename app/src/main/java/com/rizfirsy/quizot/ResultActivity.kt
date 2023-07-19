package com.rizfirsy.quizot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra(Constants.totalCorrectAnswer, 0)
        val totalQuestions = intent.getIntExtra(Constants.totalQuestion, 0)
        val tvUsername: TextView = findViewById(R.id.tv_username)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvUsername.text = intent.getStringExtra(Constants.username)
        tvScore.text = "Your score is $score of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}