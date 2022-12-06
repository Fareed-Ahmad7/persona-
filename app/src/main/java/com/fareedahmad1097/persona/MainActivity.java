package com.fareedahmad1097.persona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = findViewById(R.id.open_gallery);
        button.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, EditImage.class);
            MainActivity.this.startActivity(myIntent);
        });
    }
}