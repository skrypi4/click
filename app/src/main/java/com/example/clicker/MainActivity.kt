package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button)
        val magaz = findViewById<Button>(R.id.button2)
        val text = findViewById<TextView>(R.id.textView)

        var click: Int = 1
        var balanse: Int = 0

        buttonClick.setOnClickListener {
            balanse += click //Главное число
            text.text = balanse.toString()
        }

        magaz.setOnClickListener {
            val intent = Intent(this, Magazine::class.java)
            intent.putExtra("click", text.text)
                startActivity(intent)
        }
    }
}