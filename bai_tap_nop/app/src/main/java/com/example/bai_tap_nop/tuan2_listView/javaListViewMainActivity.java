package com.example.bai_tap_nop.tuan2_listView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.bai_tap_nop.R;

public class javaListViewMainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_list_view_main);

        lv = findViewById(R.id.listView1);
        String[] arr = new String[]{"thu 2","thu 3","thu 4","thu 5","thu 6","thu 7","chu nhat"};

        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);

        lv.setAdapter(adapter);
    }
}