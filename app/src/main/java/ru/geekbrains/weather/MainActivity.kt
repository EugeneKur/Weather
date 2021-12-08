package ru.geekbrains.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_weather: Button = findViewById(R.id.button_weather)
        button_weather.setOnClickListener { v: View ->
            Toast.makeText(
                this@MainActivity,
                "У природы нет плохой погоды",
                Toast.LENGTH_SHORT
            ).show()
        }

        val weather = Weather("Ivanovo", 23, "East")
        var town: EditText = findViewById<EditText>(R.id.text_town)
        town.setText(String.valueOf(weather.town))

    }
}