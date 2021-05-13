package com.example.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Magazine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazine)

        val tovar: ArrayList<String> = ArrayList<String>()       //{"Первая строчка","Вторая строчка","Гордей","Вперед"} // Неизменяемый список
        var balanse: String


        tovar.add("+1")
        tovar.add("+1")
        tovar.add("+2")
        tovar.add("+3")
        tovar.add("+4")
        tovar.add("$tovar")

       // var intent = intent
      //  intent.getIntExtra("balanse", 0)
       // intent.getIntExtra("click", 1)
        //balanse.text = getIntent().getStringExtra("click")


        val list = findViewById<ListView>(R.id.list1)
        val adapter = Adapter(tovar, click = 1) //не работает
        list.adapter = adapter

    }
}