package com.example.rocca.gamesreviews;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista_giochi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_giochi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        List <Gioco> list = new LinkedList<Gioco>();
        list.add(new Gioco("Fifa18","Calcio", R.drawable.fifa18));
        list.add(new Gioco("Destiny","sd",R.drawable.dest));
        list.add(new Gioco("Super mario","dsf",R.drawable.mario));
        AdapterItem adapter = new AdapterItem(this, R.layout.elemlista, list);
        ListView listView = (ListView)findViewById(R.id.lista);
        listView.setAdapter(adapter);
        /*ArrayList autori = new ArrayList();
        autori.add(new Gioco("Fifa18","Calcio", R.drawable.fifa18));
        autori.add(new Gioco("Destiny","sd",R.drawable.dest));
        autori.add(new Gioco("Super mario","dsf",R.drawable.mario));
        ListView listaAutori = (ListView) findViewById(R.id.lista);
        AdapterItem madapter = new AdapterItem(this, autori);
        listaAutori.setAdapter(madapter);*/
    }


}
