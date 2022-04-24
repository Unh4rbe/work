package com.example.work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x2button = findViewById<Button>(R.id.button2)
        var textView = findViewById<TextView>(R.id.textView)
        var hronit = 0
        var countButton = findViewById<Button>(R.id.button)
        var plus = 2


            x2button.setOnClickListener {
                hronit += plus
                textView.text = hronit.toString()


        }
        countButton.setOnClickListener {
            hronit++
            textView.text = hronit.toString()

        }

        }


    }
