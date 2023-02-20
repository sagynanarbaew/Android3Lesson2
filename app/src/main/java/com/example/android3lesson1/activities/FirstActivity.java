package com.example.android3lesson1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android3lesson1.MainActivity;
import com.example.android3lesson1.R;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText = (EditText) findViewById(R.id.firstEditText);

        button = (Button) findViewById(R.id.button_first);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", editText.getText().toString());
        startActivity(intent);




    }
}

