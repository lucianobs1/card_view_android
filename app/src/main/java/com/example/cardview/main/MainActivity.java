package com.example.cardview.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Luciano Brandão", "#Partiu Salvador", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Litoral", "#Partiu SKate", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Jamilton Damasceno", "#Partiu Salvador", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Jamilton Damasceno", "#Partiu Salvador", R.drawable.imagem4);
        this.postagens.add(p);

    }
}