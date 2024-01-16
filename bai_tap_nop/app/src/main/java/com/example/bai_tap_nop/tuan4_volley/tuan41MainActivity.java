package com.example.bai_tap_nop.tuan4_volley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bai_tap_nop.R;

public class tuan41MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan41_main);
        tuan4_volleyFn volleyFn = new tuan4_volleyFn();
        tvKQ = findViewById(R.id.tuan421TvKQ);
        btnGetData = findViewById(R.id.tuan421Btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context, tvKQ);
            }
        });
    }
}