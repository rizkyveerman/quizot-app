package com.rizfirsy.quizot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName: EditText = findViewById(R.id.nameInput)
        val buttonStart: Button = findViewById(R.id.buttonStart)
        buttonStart.setOnClickListener {
            if(inputName.text.isEmpty()){
                Toast.makeText(this,
                    "Enter your name first to get started!",
                    Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuestionActivity::class.java)

                // send name to constant object in order to make it available for other activity
                intent.putExtra(Constants.username, inputName.text.toString())

                // start the targeted activity
                startActivity(intent)

                // finish current activity
                finish()
            }
        }
    }
}