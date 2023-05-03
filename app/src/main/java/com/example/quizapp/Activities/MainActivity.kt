package com.example.quizapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.quizapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var samplebtn : Button
    private lateinit var samplebtn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        samplebtn = findViewById(R.id.samplebtn)
        samplebtn.setOnClickListener {
            var intent = Intent(this,Add_Quiz_Info::class.java)
            startActivity(intent)
        }
        samplebtn2 = findViewById(R.id.samplebtn2)

        samplebtn2.setOnClickListener {
            var intent = Intent(this,View_All_Quizes::class.java)
            startActivity(intent)
        }
    }
}