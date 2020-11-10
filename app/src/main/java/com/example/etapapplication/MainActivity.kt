package com.example.etapapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mylibrary.Controller
import com.example.mylibrary.MathOps
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var type: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAddition.setOnClickListener {
            if (etInput1.text?.trim().toString().isNotEmpty() && etInput2.text?.trim().toString().isNotEmpty()) {
                type = "Addition"
                Controller().arthOperations(this@MainActivity, type, etInput1.text?.trim().toString().toInt(), etInput2.text?.trim().toString().toInt())
            } else {
                Toast.makeText(this, "Please enter numbers to be added", Toast.LENGTH_SHORT).show()
            }
        }

        btSubtraction.setOnClickListener {
            if (etInput1.text?.trim().toString().isNotEmpty() && etInput2.text?.trim().toString().isNotEmpty()) {
                type = "Subtraction"
                Controller().arthOperations(this@MainActivity, type, etInput1.text?.trim().toString().toInt(), etInput2.text?.trim().toString().toInt())

            } else {
                Toast.makeText(this, "Please enter numbers to be subtracted", Toast.LENGTH_SHORT).show()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 1) {
            val result = data?.getIntExtra("result", 0)

            tv_result.text = "Input One : " + etInput1.text?.trim().toString() +
                    "\nInput Two : " + etInput2.text?.trim().toString() +
                    "\nAction : " + type +
                    "\nOutput is : " + result

        }
    }
}