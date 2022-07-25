package com.example.meusexames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DependenteActivity2 extends AppCompatActivity {

    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependente2);

        btnCadastro = findViewById(R.id.button);
        btnCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DependenteActivity2.this, HomeActivity2.class);
                Toast.makeText(getApplicationContext(), "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });

    }
}