package com.example.splash



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


import java.util.*
import kotlin.concurrent.timerTask

class Page1 : AppCompatActivity() {

lateinit var text1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1_main)
        text1=findViewById(R.id.txt)
        //---

        Timer().schedule(timerTask {
            var    page1=Intent(this@Page1,Page2::class.java)
            startActivity(page1)
            finish()
        },7000)
//----------------------



    }






}



