package com.fareedahmad1097.persona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton galleryClick = findViewById(R.id.open_gallery);
        ImageButton cameraClick = findViewById(R.id.open_camera);

        galleryClick.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, EditImage.class);
            MainActivity.this.startActivity(myIntent);
        });

        cameraClick.setOnClickListener(v -> {
            System.out.println("working!");
            Intent myIntent = new Intent(MainActivity.this, takePicture.class);
            MainActivity.this.startActivity(myIntent);
        });
    }
}