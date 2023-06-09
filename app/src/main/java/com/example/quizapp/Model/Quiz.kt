package com.example.quizapp.Model

class Quiz (
    var id :String = "",
    var title :String ="",
    var grade : String ="",
    var course : String="",
    var questions: MutableList<Question> = mutableListOf<Question>()
){
    constructor(id: String, title: String, grade: String, course: String) : this(id, title, grade, course, mutableListOf<Question>())
}