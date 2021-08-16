package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button:Button=findViewById(R.id.roll_button)
       roll_button.setOnClickListener(){
           rollDice()

       }
    }

    private fun rollDice() {
        val drawableResources= when (java.util.Random().nextInt(6) + 1) {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
        val dice_image:ImageView=findViewById(R.id.dice_image)
        dice_image.setImageResource(drawableResources)
    }
}