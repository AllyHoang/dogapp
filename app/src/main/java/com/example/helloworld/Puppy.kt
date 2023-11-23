package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Puppy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puppy)
        val button = findViewById<Button>(R.id.hiButton)
        button.setOnClickListener {
            Toast.makeText(this, "Arf! Woof!", Toast.LENGTH_SHORT).show()
        }
    }
}