package com.example.practica05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referencia al Spinner
        Spinner dropdownMenu = findViewById(R.id.dropdown_menu);

        // Carga el array de strings desde los recursos
        String[] restaurants = getResources().getStringArray(R.array.restaurants);

        // Configura el adaptador para el Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, restaurants);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownMenu.setAdapter(adapter);

        Button demana = findViewById(R.id.demanaBtn);
        demana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Hamburguesas.class   );
                startActivity(intent);
            }
        });
    }
}