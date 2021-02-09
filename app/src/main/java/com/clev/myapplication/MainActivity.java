package com.clev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewlById(R.id.button);
    }
}

button.setOnClickListener(new View.OnClickListener()){


@Override
public void onClick(View view) {

    Toast.macktext(MainActivity.this, "fucionando", Toast.LENGTH_LONG).show();

    }
}