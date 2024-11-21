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

        LinearLayout single = findViewById(R.id.layoutSingle);
        LinearLayout cheese = findViewById(R.id.layoutCheese);
        LinearLayout vici = findViewById(R.id.layoutVici);
        LinearLayout bacon = findViewById(R.id.layoutBacon);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hamburguesas.this, sigleBurger.class);
                startActivity(intent);
            }
        });
        cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hamburguesas.this, ChesseBurguer.class);
                startActivity(intent);
            }
        });
        vici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hamburguesas.this, VICIOriginals.class);
                startActivity(intent);
            }
        });

        bacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hamburguesas.this, BaconCheeseburger.class);
                startActivity(intent);
            }
        });
    }
}