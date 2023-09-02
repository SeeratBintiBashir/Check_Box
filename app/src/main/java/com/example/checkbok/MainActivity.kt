package com.example.checkbok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var checkBoxKotlin: CheckBox
    private lateinit var checkBoxJava: CheckBox
    private lateinit var checkBoxPython: CheckBox
    private lateinit var textViewChoice: TextView
    private lateinit var showButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxKotlin = findViewById(R.id.checkBoxKotlin)
        checkBoxJava = findViewById(R.id.checkBoxJava)
        checkBoxPython = findViewById(R.id.checkBoxPython)
        textViewChoice = findViewById(R.id.textViewChoice)
        showButton = findViewById(R.id.showButton)

        showButton.setOnClickListener {
            val sb = StringBuilder()
            sb.append(checkBoxKotlin.text.toString() + "status is: " +
                     checkBoxKotlin.isChecked + "\n")
            sb.append(checkBoxJava.text.toString() + "status is: " +
                     checkBoxJava.isChecked + "\n")
            sb.append(checkBoxPython.text.toString() + "status is: " +
                    checkBoxPython.isChecked + "\n")

            textViewChoice.text = sb.toString()
        }

    }
}