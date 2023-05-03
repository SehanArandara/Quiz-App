package com.example.quizapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R

class View_All_Quizes : AppCompatActivity() {

    private lateinit var recycleView1 : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_quizes2)

        recycleView1 = findViewById(R.id.recycleView1)
        recycleView1.layoutManager = LinearLayoutManager(this)
        recycleView1.setHasFixedSize(true)


    }
}