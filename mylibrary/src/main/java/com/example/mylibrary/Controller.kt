package com.example.mylibrary

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent


class Controller: MathOps {

    override fun arthOperations(context: Context,type:String, num1: Int, num2: Int) {
        try {
            val myIntent = Intent(Intent.ACTION_MAIN)
            myIntent.component =
                ComponentName(
                    "com.example.etapapplication2",
                    "com.example.etapapplication2.MainActivity"
                )
            myIntent.putExtra("num1",num1)
            myIntent.putExtra("num2",num2)
            myIntent.putExtra("type",type)
            (context as Activity).startActivityForResult(myIntent,1)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }

}