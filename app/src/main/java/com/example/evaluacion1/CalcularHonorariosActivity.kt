package com.example.evaluacion1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularHonorariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcular_honorarios)

        val tvTitleHonorarios = findViewById<TextView>(R.id.tvTitleHonorarios)
        val etNombreHonorarios = findViewById<EditText>(R.id.etNombreHonorarios)
        val etSueldoHonorarios = findViewById<EditText>(R.id.etSueldoHonorarios)
        val btnCalcularHonorarios = findViewById<Button>(R.id.btnCalcularHonorarios)
        val btnVolverInicioHonorarios = findViewById<Button>(R.id.btnVolverInicioHonorarios)

        btnCalcularHonorarios.setOnClickListener {
            val nombre = etNombreHonorarios.text.toString()
            val sueldoStr = etSueldoHonorarios.text.toString()

            if (nombre.isNotEmpty() && sueldoStr.isNotEmpty()) {
                val sueldo = sueldoStr.toDouble()
                val retencion = sueldo * 0.13
                val pagoNeto = sueldo - retencion

                val mensaje = "Nombre: $nombre\nSueldo: $sueldo\nRetención (13%): $retencion\nPago Neto: $pagoNeto"
                tvTitleHonorarios.text = mensaje
            }
        }

        btnVolverInicioHonorarios.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


