package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.webkit.WebView
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //xml에 디자인한 2개의 버튼과 텍스트 뷰 가져오기
        val btn1 = findViewById(R.id.btn1) as Button
        val btn2 = findViewById(R.id.btn2) as Button
        val text = findViewById(R.id.text) as TextView

        btn1.setOnClickListener {
            text.visibility = View.VISIBLE
        }

        btn2.setOnClickListener {
            text.visibility = View.INVISIBLE
        }


    }
}