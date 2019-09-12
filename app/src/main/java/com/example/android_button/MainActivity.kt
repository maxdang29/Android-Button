package com.example.android_button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_submit)
        button.setText("Submit submit").toString()
//        button.setOnClickListener{
//            button.setText("Cancel").toString()
//            Toast.makeText(applicationContext,"message",Toast.LENGTH_SHORT).show()
//        }
    }

    fun click(view: View){
        val button = view as Button
        button.setText("Lalala").toString()
        Toast.makeText(applicationContext,"message",Toast.LENGTH_SHORT).show()
    }
}
