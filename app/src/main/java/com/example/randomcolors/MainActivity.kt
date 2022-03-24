package com.example.randomcolors

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button)
        val mColor = findViewById<ImageView>(R.id.Color)
        val mRGBValues = findViewById<TextView>(R.id.RGBValues)
        mButton.setOnClickListener{
            val randomColor = List(3){ Random.nextInt(0, 255)}
            mColor.setBackgroundColor(Color.rgb(randomColor[0], randomColor[1], randomColor[2]))
            mRGBValues.text = randomColor[0].toString() + ", " + randomColor[1].toString() + ", " + randomColor[2].toString()
        }
    }



}