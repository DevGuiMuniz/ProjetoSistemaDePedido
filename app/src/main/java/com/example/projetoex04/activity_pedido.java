package com.example.projetoex04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;

public class activity_pedido extends AppCompatActivity {

    TextInputEditText etNomeCliente;
    Button btnHamburguer, btnCachorroQuente, btnMistoQuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        etNomeCliente = findViewById(R.id.etNomeCliente);
        btnHamburguer = findViewById(R.id.btnHamburguer);
        btnCachorroQuente = findViewById(R.id.btnCachorroQuente);
        btnMistoQuente = findViewById(R.id.btnMistoQuente);

        View.OnClickListener listener = view -> {
            String nome = etNomeCliente.getText().toString().trim();
            String lanche = "";

            if (view.getId() == R.id.btnHamburguer) {
                lanche = "Hambúrguer";
            } else if (view.getId() == R.id.btnCachorroQuente) {
                lanche = "Cachorro-Quente";
            } else if (view.getId() == R.id.btnMistoQuente) {
                lanche = "Misto-Quente";
            }

            Intent intent = new Intent(activity_pedido.this, activity_resumo.class);
            intent.putExtra("nome_cliente", nome);
            intent.putExtra("lanche_escolhido", lanche);
            startActivity(intent);
        };

        btnHamburguer.setOnClickListener(listener);
        btnCachorroQuente.setOnClickListener(listener);
        btnMistoQuente.setOnClickListener(listener);
    }
}
