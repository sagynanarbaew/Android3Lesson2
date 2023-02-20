package com.example.android3lesson1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android3lesson1.R;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.secondViewText);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        textView.setText(name);


        findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);


            }
        });

        findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);


            }
        });
    }
}