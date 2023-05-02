package com.example.quizapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.quizapp.R

class View_Quiz_Details : AppCompatActivity() {

    private lateinit var  button11 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_quiz_details)

        button11 = findViewById(R.id.button11)
        button11.setOnClickListener {
            var intent = Intent(this,View_Quiz_Details::class.java)
            startActivity(intent)
        }

    }
}