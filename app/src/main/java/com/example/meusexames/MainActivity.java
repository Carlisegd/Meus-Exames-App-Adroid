package com.example.meusexames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView btnCadastrar;
    private EditText email, senha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextTextEmailAddress);
        senha = findViewById(R.id.editTextTextPassword);

        btnEntrar = findViewById(R.id.buttonEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             String variavelEmail = email.getText().toString();
             String variavelSenha = senha.getText().toString();

             if (variavelEmail.equals("carlise@ibm.com") && variavelSenha.equals("qwe123")) {

                 Intent intent = new Intent(MainActivity.this, HomeActivity2.class);
                 intent.putExtra("chave_email", variavelEmail);
                 intent.putExtra("chave_senha", variavelSenha);

                 startActivity(intent);

             } else {
                 Toast.makeText(getApplicationContext(),
                         "Senha ou e-mail incorretos, tente novamente!",
                         Toast.LENGTH_LONG).show();
             }
         }
      });
            btnCadastrar = findViewById(R.id.abrirCadastro);
            btnCadastrar.setOnClickListener(new View.OnClickListener() {

          @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CadastroActivity3.class);
                startActivity(intent);
            }
     });
   }
}