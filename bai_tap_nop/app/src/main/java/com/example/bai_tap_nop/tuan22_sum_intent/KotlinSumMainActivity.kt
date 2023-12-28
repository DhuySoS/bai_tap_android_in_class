package com.example.bai_tap_nop.tuan22_sum_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.bai_tap_nop.R

class kotlinSumMainActivity : AppCompatActivity() {
    var num1: EditText? = null
    var num2: EditText? = null
    var sum: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_sum_main)

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        sum = findViewById(R.id.tong);
        sum!!.setOnClickListener({
            var i = Intent(this@kotlinSumMainActivity,
                kotlinSumSecondActivity::class.java)
            i.putExtra("so1",num1!!.text.toString())
            i.putExtra("so2",num2!!.text.toString())
            startActivity(i)
        })

    }
}