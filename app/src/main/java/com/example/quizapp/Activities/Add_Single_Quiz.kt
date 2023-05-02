package com.example.quizapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.quizapp.R

class Add_Single_Quiz : AppCompatActivity() {

    private  lateinit var nextBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_single_quiz)

        nextBtn = findViewById(R.id.nextBtn)

        nextBtn.setOnClickListener {
            var intent =  Intent(this,View_Quiz_Details::class.java)
            startActivity(intent)
        }
    }
}