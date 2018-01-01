package com.example.rocca.gamesreviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rossi on 01/01/2018.
 */

public class AdapterItem extends ArrayAdapter<Gioco>{

    /*private List<Gioco> giochi=null;
    private Context context=null;

    public AdapterItem(Context context, List<Gioco> giochi)
    {
        this.giochi=giochi;
        this.context=context;
    }


    public int getCount()
    {
        return giochi.size();
    }


    public Object getItem(int position)
    {
        return giochi.get(position);
    }


    public long getItemId(int position)
    {
        return getItem(position).hashCode();
    }


    public View getView(int position, View v, ViewGroup vg)
    {
        if (v==null)
        {
            v=LayoutInflater.from(context).inflate(R.layout.elemlista, null);
        }
        Gioco ai=(Gioco) getItem(position);
        TextView txt=(TextView) v.findViewById(R.id.description);
        txt.setText(ai.getNome());
        txt=(TextView) v.findViewById(R.id.description);
        txt.setText(ai.getDescrizione());
        return v;
    }*/
    public AdapterItem(Context context, int textViewResourceId,
                         List <Gioco> objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.elemlista, null);
        TextView titolo = (TextView)convertView.findViewById(R.id.title);
        TextView descrizione = (TextView)convertView.findViewById(R.id.description);
        Gioco c = getItem(position);
        titolo.setText(c.getNome());
        descrizione.setText(c.getDescrizione());
        return convertView;
    }


}
