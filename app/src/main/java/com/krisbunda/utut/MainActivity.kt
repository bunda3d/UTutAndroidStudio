package com.krisbunda.utut

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* get reference to button */
        //val btnCounter = findViewById(R.id.btnCountClicks) as Button
        //var myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        /* set on-click listener */
        btnCountClicks.setOnClickListener {
            timesClicked += 1
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi There.", Toast.LENGTH_SHORT).show()
        }

    }
}