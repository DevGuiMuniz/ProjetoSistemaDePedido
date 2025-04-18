package com.example.projetoex04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnFazerPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFazerPedido = findViewById(R.id.btnFazerPedido);

        btnFazerPedido.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_pedido.class);
            startActivity(intent);
        });
    }
}
