package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val AgeEnter = findViewById<EditText>(R.id.AgeEnter)
        val BtnGenerate = findViewById<Button>(R.id.BtnGenerate)
        val BtnClear = findViewById<Button>(R.id.BtnClear)
        val Celebrity = findViewById<TextView>(R.id.Celebrity)

        BtnGenerate.setOnClickListener{
            BtnClear.setOnClickListener{AgeEnter.text.clear()}
            val age = AgeEnter.text.toString()
            val ageText = AgeEnter.text.toString()
            if (!ageText.isNullOrEmpty()) {
                val age = ageText.toInt()
                val name = if (age in 10..17) {
                    "American actress, Heather O'Rourke passed away at the age of 12"
                } else if (age in 18..25) {
                    "American actor, Cameron Boyce passed away at the age of 20"
                } else if (age in 26..29) {
                    "American rapper and singer-songwriter, Mac Miller who passed away at the age of 26"
                } else if (age in 30..35) {
                    "Hong Kong-American martial artist and actor, Bruce Lee passed away at the age of 32"
                } else if (age in 36..39){
                    "Diana,Princess of Wales passed away at the age of 36"
                } else if (age in 40..49){
                    "American actor, Paul Walker passed away at the age of 40"
                } else if (age in 50..59){
                    "Amercican-Canadian actor, Matthew Perry passed away at the age of 54"
                } else if (age in 60..79){
                    "Argentine football player, Diego Maradona passed away at the age of 60"
                } else if (age in 80..89){
                    "American astronaut and aeronautical engineer, Neil Armstrong passed away at the age of 82"
                } else if (age in 90..99){
                    "Former President of South Africa, Nelson Mandela died at age 95"

                } else {

                }
            }
        }



    }
}