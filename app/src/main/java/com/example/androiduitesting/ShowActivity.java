package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        String cityName = getIntent().getStringExtra("city_name");
        TextView textView = findViewById(R.id.city_text);
        textView.setText(cityName);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> finish());

    }
}
