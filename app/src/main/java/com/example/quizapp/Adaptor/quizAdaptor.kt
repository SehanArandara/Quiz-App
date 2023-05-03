package com.example.quizapp.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.Model.Quiz
import com.example.quizapp.R


class quizAdaptor (private val quizList :ArrayList<Quiz>) :
    RecyclerView.Adapter<quizAdaptor.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val quizView = LayoutInflater.from(parent.context)
          .inflate(R.layout.activity_single_quiz,parent,false)

        return ViewHolder(quizView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentQuiz = quizList[position]
        holder.tvQuizName.text = currentQuiz.title
    }

    override fun getItemCount(): Int {
        return quizList.size
    }

    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
            val tvQuizName : TextView = itemView.findViewById(R.id.tvQuizName)
    }


}