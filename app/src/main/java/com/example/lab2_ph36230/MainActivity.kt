package com.example.lab2_ph36230

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_click)
        val edtHoten = findViewById<EditText>(R.id.edt_hoten)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        btn.setOnClickListener {
            val hoten = edtHoten.text.toString()
            tvResult.text = hoten
        }
    }
}