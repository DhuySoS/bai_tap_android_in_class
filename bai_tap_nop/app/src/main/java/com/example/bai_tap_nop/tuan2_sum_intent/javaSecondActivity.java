package com.example.bai_tap_nop.tuan2_sum_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.bai_tap_nop.R;

public class javaSecondActivity extends AppCompatActivity {

    TextView ans;

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_second);

        ans = findViewById(R.id.answer);
        back = findViewById(R.id.back);
        back.setOnClickListener(v->{
            Intent i2 = new Intent(javaSecondActivity.this,
                    javaMainActivity.class);
            startActivity(i2);
        });
        Intent i1 = getIntent();

        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 = i1.getExtras().getString("so2");

        Float so1 = Float.parseFloat(chuoi1);
        Float so2 = Float.parseFloat(chuoi2);
        Float tong = so1 + so2;
        ans.setText("Đáp án: "+ String.valueOf(tong));
    }
}