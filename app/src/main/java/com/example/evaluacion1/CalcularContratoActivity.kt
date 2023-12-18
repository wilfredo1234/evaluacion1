package com.example.evaluacion1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularContratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcular_contrato)

        val tvTitleContrato = findViewById<TextView>(R.id.tvTitleContrato)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etSueldo = findViewById<EditText>(R.id.etSueldo)
        val btnCalcularContrato = findViewById<Button>(R.id.btnCalcularContrato)
        val btnVolverInicioContrato = findViewById<Button>(R.id.btnVolverInicioContrato)

        btnCalcularContrato.setOnClickListener {
            val nombre = etNombre.text.toString()
            val sueldoStr = etSueldo.text.toString()

            if (nombre.isNotEmpty() && sueldoStr.isNotEmpty()) {
                val sueldo = sueldoStr.toDouble()
                val retencion = sueldo * 0.20
                val pagoNeto = sueldo - retencion

                val mensaje = "Nombre: $nombre\nSueldo: $sueldo\nRetención (20%): $retencion\nPago Neto: $pagoNeto"
                tvTitleContrato.text = mensaje
            }
        }

        btnVolverInicioContrato.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
