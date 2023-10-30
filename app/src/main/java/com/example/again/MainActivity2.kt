package com.example.again

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import android.widget.ArrayAdapter
import android.widget.AdapterView

import android.widget.Spinner

import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var usernameSpinner: Spinner
    private lateinit var usernameSpinner1: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        usernameSpinner = findViewById(R.id.usernameSpinner)
        usernameSpinner1 = findViewById(R.id.usernameSpinner1)

        val spinnerData = arrayOf("Option 1", "Option 2", "Option 3", "Option 4")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerData)
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item)

        usernameSpinner.adapter = adapter
        usernameSpinner.setSelection(0)

        usernameSpinner1.adapter = adapter
        usernameSpinner1.setSelection(0)



    }
}
