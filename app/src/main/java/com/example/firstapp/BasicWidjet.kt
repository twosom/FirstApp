package com.example.firstapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_basic_widjet.*

class BasicWidjet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //xml파일을 전개해서 메모리에 로드하고 화면에 출력하는 코드
        setContentView(R.layout.activity_basic_widjet)
        val result: Boolean = true
        text1.setOnClickListener{
            if (result == true) {
                text1.setBackgroundColor(Color.BLUE)
                !result
            } else if (result != true){
                text1.setBackgroundColor(Color.RED)
                !result
            }
        }
        //입력 된 문자열을 String으로 가져오기
        val text: String = edit1.text.toString()


        //3글자 이상 입력 할 수 없도록 설정.
        edit1.setFilters(arrayOf<InputFilter>(InputFilter.LengthFilter(3)))

        //버튼을 누르면 키보드 숨기기
        hideBtn.setOnClickListener{
            //키보드 관리 객체
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            //eidt1의 키보드 제어권 뺏기
            imm.hideSoftInputFromWindow(edit1.getWindowToken(), 0)
        }

        // 버튼을 누르면 키보드 출력
        showBtn.setOnClickListener {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            //edit1 에 입력하는 키보드를 화면에 출력.
            imm.showSoftInput(edit1, 0)
        }




    }
}