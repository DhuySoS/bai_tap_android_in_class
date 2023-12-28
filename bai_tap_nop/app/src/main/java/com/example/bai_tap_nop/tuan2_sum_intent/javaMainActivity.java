package com.example.bai_tap_nop.tuan2_sum_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.bai_tap_nop.R;

public class javaMainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
        num1 = findViewById(R.id.sumNumber1);
        num2 = findViewById(R.id.sumNumber2);
        tong = findViewById(R.id.sum);
        tong.setOnClickListener(v->{
            Intent i = new Intent(javaMainActivity.this,
                    javaSecondActivity.class);
            i.putExtra("so1",num1.getText().toString());
            i.putExtra("so2",num2.getText().toString());
            startActivity(i);
        });
    }
}