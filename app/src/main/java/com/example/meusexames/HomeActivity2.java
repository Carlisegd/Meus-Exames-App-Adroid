package com.example.meusexames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity2 extends AppCompatActivity {

    private ImageView btnAdicinarDependente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        btnAdicinarDependente = findViewById(R.id.imageView5);
        btnAdicinarDependente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity2.this, DependenteActivity2.class);
                startActivity(intent);
            }
        });
    }



        public void onClickPesquisa(View view){

        AlertDialog.Builder caixaMsg = new AlertDialog.Builder(this);
        caixaMsg.setTitle("Buscar Exame ou dependente");
        caixaMsg.setMessage("Digite sua busca:");
        final View custonLayout = getLayoutInflater().inflate(R.layout.layout_dialog, null);
        caixaMsg.setView(custonLayout);
        caixaMsg.setCancelable(false);
        caixaMsg.setIcon(android.R.drawable.ic_search_category_default);
        caixaMsg.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                EditText textoMensagem = custonLayout.findViewById(R.id.textoMensagem);
                Toast.makeText(getApplicationContext(), "Procurando " + textoMensagem.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        caixaMsg.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Pesquisa Cancelada", Toast.LENGTH_SHORT).show();
            }
        });
        caixaMsg.create();
        caixaMsg.show();
    }
}