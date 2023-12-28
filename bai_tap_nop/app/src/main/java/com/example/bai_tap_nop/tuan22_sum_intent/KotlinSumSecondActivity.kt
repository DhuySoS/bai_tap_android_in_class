package com.example.bai_tap_nop.tuan22_sum_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.bai_tap_nop.R

class kotlinSumSecondActivity : AppCompatActivity() {
    var ans:TextView? = null
    var back:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_sum_second)

        ans = findViewById(R.id.klAnswer);
        back = findViewById(R.id.klBack);
        var i1 = intent
        var chuoi1 = i1.extras!!.getString("so1")
        var chuoi2 = i1.extras!!.getString("so2")
        var so1 = chuoi1!!.toFloat()
        var so2 = chuoi2!!.toFloat()
        var tong = so1 + so2
        ans!!.setText("Đáp án: "+ tong.toString())
        back!!.setOnClickListener({
            var i2 = Intent(this@kotlinSumSecondActivity,
                kotlinSumMainActivity::class.java)
            startActivity(i2)
        })


    }
}