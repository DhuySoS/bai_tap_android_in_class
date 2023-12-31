package com.example.bai_tap_nop.tuan22_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.bai_tap_nop.R

class kotlinListViewMainActivity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_list_view_main)
        lv = findViewById(R.id.klListView);
        var arr = arrayOf("thu 2","thu 3","thu 4","thu 5","thu 6","thu 7","chu nhat")
        var adapter = ArrayAdapter(this,
            android.R.layout.activity_list_item,arr)
        lv!!.adapter = adapter
    }
}