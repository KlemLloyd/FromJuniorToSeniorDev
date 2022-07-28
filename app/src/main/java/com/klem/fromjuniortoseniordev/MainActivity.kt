package com.klem.fromjuniortoseniordev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printBorder(23)
    }

    private fun printBorder(borderLength: Int) {
        repeat(borderLength) {
            print("=")
        }
    }
}