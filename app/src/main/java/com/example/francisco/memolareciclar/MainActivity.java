package com.example.francisco.memolareciclar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Frase> listaFrase;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.elReciclador);
        listaFrase = new ArrayList<>();
        ListAdpater adapter = new ListAdpater(listaFrase);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        Frase frase = new Frase("¡¿Pero que vos penseu que els xiquets son de cartulina o algo?!");
        listaFrase.add(frase);

        frase = new Frase("¡Pedres! ¡¿Pero a on estan les pedres?!");
        listaFrase.add(frase);

        frase = new Frase("De ferro in-oxidable");
        listaFrase.add(frase);

        frase = new Frase("De ferro oxidable");
        listaFrase.add(frase);

        frase = new Frase("Coneixement");
        listaFrase.add(frase);

        frase = new Frase("Bisca l'independencia");
        listaFrase.add(frase);

    }
}
