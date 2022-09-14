package com.example.practical_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var mMessage_edittext:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessage_edittext=findViewById(R.id.edittext_main)
    }

    fun GoToNext(view:View)
    {
        Log.d("Mainactivity","Clicked")
        val message=mMessage_edittext.text.toString()
        intent= Intent(this,secondactivity::class.java)
        intent.putExtra("MainActivity",message)
        startActivity(intent)
    }
}