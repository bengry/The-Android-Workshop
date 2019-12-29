package com.example.colors

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redChannelText = (red_channel as EditText).text
        val greenChannelText = (green_channel as EditText).text
        val blueChannelText = (blue_channel as EditText).text

        color_creator_button.setOnClickListener(View.OnClickListener {

            val colorToDisplay = redChannelText.toString().plus(greenChannelText).plus(blueChannelText)


                Log.d("colorToDisplay: %s",colorToDisplay)

                val colorAsInt = Color.parseColor("#".plus(colorToDisplay))
                color_creator_display.setBackgroundColor(colorAsInt)

        })
    }
}