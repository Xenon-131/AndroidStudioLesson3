package ru.mirea.egorovakv.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent intent = getIntent();
        String time = intent.getStringExtra("time");
        String output = String.format("КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА\n" +
                "ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 121,\n" +
                "а текущее время - "+ time);
        textView = findViewById(R.id.textView);
        textView.setText(output);
    }
}