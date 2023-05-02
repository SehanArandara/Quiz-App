package com.example.quizapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.quizapp.R

class Add_Quiz_Info : AppCompatActivity() {

    private  lateinit var AddQuizbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_quiz_info)

        AddQuizbtn = findViewById(R.id.AddQuizbtn)
        AddQuizbtn.setOnClickListener {
            var intent = Intent(this,Add_Single_Quiz::class.java)
            startActivity(intent)
        }
    }
}