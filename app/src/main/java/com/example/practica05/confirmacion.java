package com.example.practica05;

import static kotlin.random.RandomKt.Random;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class confirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirmacion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Random random = new Random();
        int randomNumber = random.nextInt(10000 - 2000 + 1) + 2000;

        TextView textView = findViewById(R.id.numcomanda);
        // Comprobar si el TextView es nulo
        if (textView != null) {
            textView.setText("Comanda num #" + randomNumber);
        } else {
            // Manejar el error si el TextView no se encuentra
            System.err.println("Error: TextView con ID 'numcomanda' no encontrado.");
        }

    }
}