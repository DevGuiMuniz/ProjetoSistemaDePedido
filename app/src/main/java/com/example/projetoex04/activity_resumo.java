package com.example.projetoex04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_resumo extends AppCompatActivity {

    TextView tvResumo;
    Button btnNovoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        tvResumo = findViewById(R.id.tvResumo);
        btnNovoPedido = findViewById(R.id.btnNovoPedido);

        String nome = getIntent().getStringExtra("nome_cliente");
        String lanche = getIntent().getStringExtra("lanche_escolhido");

        tvResumo.setText("Olá " + nome + ", seu pedido de " + lanche + " foi registrado com sucesso!");

        btnNovoPedido.setOnClickListener(v -> {
            Intent intent = new Intent(activity_resumo.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
