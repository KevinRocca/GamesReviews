package com.example.rocca.gamesreviews;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Giochi extends Fragment {


    public Giochi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_giochi, container, false);
        List<Gioco> list = new LinkedList<Gioco>();
        list.add(new Gioco("Fifa18","Calcio", R.drawable.fifa18));
        list.add(new Gioco("Destiny","sd",R.drawable.dest));
        list.add(new Gioco("Super mario","dsf",R.drawable.mario));
        AdapterItem adapter = new AdapterItem(getActivity().getApplicationContext(), R.layout.elemlista, list);
        ListView listView = (ListView)view.findViewById(R.id.lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adattatore, final View componente, int pos, long id){
                Intent nuovapagina = new Intent(getActivity().getApplicationContext(), SchermataGame.class);
                Gioco item = (Gioco)adattatore.getItemAtPosition(pos);
                String name = item.getNome();
                nuovapagina.putExtra("Vocecliccata", name);
                startActivity(nuovapagina);
            }
        });
        return view;
    }

}
