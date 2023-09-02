package com.curso.android.app.practica.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        val editText1 = findViewById<EditText>(R.id.editTextText)
        val editText2 = findViewById<EditText>(R.id.editTextText2)

        val text1 = editText1.text.toString()
        val text2 = editText2.text.toString()

        if (text1 == text2) {
            // Las cadenas son iguales, muestra un Toast
            Toast.makeText(this, "Las cadenas son iguales", Toast.LENGTH_SHORT).show()
        } else {
            // Las cadenas son diferentes, realiza otra acción aquí
            Toast.makeText(this, "Las cadenas son diferentes", Toast.LENGTH_SHORT).show()
        }
    }
}
