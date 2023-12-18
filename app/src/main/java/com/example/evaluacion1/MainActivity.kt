package com.example.evaluacion1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHonorarios = findViewById<Button>(R.id.button)
        val buttonContrato = findViewById<Button>(R.id.button2)

        buttonHonorarios.setOnClickListener {
            startActivity(Intent(this, CalcularHonorariosActivity::class.java))
        }

        buttonContrato.setOnClickListener {
            startActivity(Intent(this, CalcularContratoActivity::class.java))
        }
    }
}

