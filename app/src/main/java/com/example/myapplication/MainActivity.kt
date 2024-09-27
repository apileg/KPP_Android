package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var groupTextView: TextView
    private lateinit var updateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTextView = findViewById(R.id.nameTextView)
        groupTextView = findViewById(R.id.groupTextView)
        updateButton = findViewById(R.id.updateButton)

        // Змінюємо текст групи програмно
        groupTextView.text = "Gpoup: 4-6"

        // Додаємо функціональність кнопки
        updateButton.setOnClickListener {
            nameTextView.text = "Shapoval Oleg new"
            groupTextView.text = "Gpoup: 4-6 new"
        }
    }
}
