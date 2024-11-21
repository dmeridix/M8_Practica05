package com.example.practica05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Hamburguesas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hamburguesas);

        String restaurant = getIntent().getStringExtra("restaurant");

        TextView text = findViewById(R.id.TextPasat);
        text.setText(restaurant);

        LinearLayout burgers = findViewById(R.id.burgers);

        burgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hamburguesas.this, sigleBurger.class);
                startActivity(intent);
            }
        });
    }
}