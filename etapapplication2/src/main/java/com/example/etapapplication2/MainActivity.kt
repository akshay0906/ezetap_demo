package com.example.etapapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylibrary.MathOps

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        when (intent.getStringExtra("type").toString()){
            "Addition" ->{
                val sum = intent.getIntExtra("num1",0) + intent.getIntExtra("num2",0)
                val intent = Intent()
                intent.putExtra("result",sum)
                setResult(1,intent)
                finish()
            }

            "Subtraction" ->{
                val sub = intent.getIntExtra("num1",0) - intent.getIntExtra("num2",0)
                val intent = Intent()
                intent.putExtra("result",sub)
                setResult(1,intent)
                finish()
            }
        }

    }

}
