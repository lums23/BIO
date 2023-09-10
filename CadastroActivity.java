package com.example.bio;

import com.example.bio.BioModel;
import com.example.bio.BioAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextIdade;
    private EditText editTextProfissao;
    private EditText editTextResumo;
    private Button buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextProfissao = findViewById(R.id.editTextProfissao);
        editTextResumo = findViewById(R.id.editTextResumo);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextNome.getText().toString();
                String idade = editTextIdade.getText().toString();
                String profissao = editTextProfissao.getText().toString();
                String resumo = editTextResumo.getText().toString();

                if (nome.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Digite um nome válido", Toast.LENGTH_SHORT).show();
                    return;
                }

                BioModel bio = new BioModel(nome, idade, profissao, resumo);
                saveBioToFile(bio);

                // Navegar de volta para a tela anterior (MainActivity)
                onBackPressed();
            }
        });
    }

    private void saveBioToFile(BioModel bio) {
        try {
            File file = new File(getFilesDir(), "bio_data.json");
            FileWriter writer = new FileWriter(file);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}