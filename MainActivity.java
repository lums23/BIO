package com.example.bio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bio.BioModel;
import com.example.bio.BioAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BioAdapter bioAdapter;
    private Button buttonCadastrarBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<BioModel> bioList = createSampleBios();
        bioAdapter = new BioAdapter(bioList);
        recyclerView.setAdapter(bioAdapter);

        buttonCadastrarBio = findViewById(R.id.buttonCadastrarBio);
        buttonCadastrarBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }

    private List<BioModel> createSampleBios() {
        List<BioModel> bioList = new ArrayList<>();
        bioList.add(new BioModel("Nome 1", "25 anos", "Profissão 1", "Resumo 1"));
        bioList.add(new BioModel("Nome 2", "30 anos", "Profissão 2", "Resumo 2"));
        return bioList;
    }
}