package com.example.kotlinprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val recieveDataInput : String =intent.getStringExtra("Key")
        comingData.text =  recieveDataInput
    }
}
