package com.example.rocca.gamesreviews;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rossi on 01/01/2018.
 */

public class AdapterItem extends ArrayAdapter<Gioco>{

    private Context con;
    private Activity mActivity;

    public AdapterItem(Context context, int textViewResourceId,
                         List <Gioco> objects) {
        super(context, textViewResourceId, objects);
        this.con=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.elemlista, null);
        TextView titolo = (TextView)convertView.findViewById(R.id.title);
        TextView descrizione = (TextView)convertView.findViewById(R.id.description);
        ImageView immagine = (ImageView)convertView.findViewById(R.id.list_image);
        Gioco c = getItem(position);
        titolo.setText(c.getNome());
        descrizione.setText(c.getDescrizione());
        immagine.setImageDrawable(con.getResources().getDrawable(c.getIdIMM()));
        return convertView;
    }

/*public class AdapterItem extends BaseAdapter{

    private Activity mActivity;
    private ArrayList listaGiochi;
    private static LayoutInflater inflater = null;


    public AdapterItem(Activity a, ArrayList list) {
        mActivity = a;
        listaGiochi = list;
        inflater = (LayoutInflater) mActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listaGiochi.size();
    }

    @Override
    public Object getItem(int item) {
        // TODO Auto-generated method stub
        return item;
    }

    @Override
    public long getItemId(int item) {
        // TODO Auto-generated method stub
        return item;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.elemlista, null);

        TextView nome = (TextView) vi.findViewById(R.id.titolo);
        TextView desc = (TextView) vi.findViewById(R.id.description);
        ImageView cop = (ImageView) vi.findViewById(R.id.list_image);
        Gioco giocoCorrente = (Gioco) listaGiochi.get(position);
        nome.setText(giocoCorrente.getNome());
        desc.setText(giocoCorrente.getDescrizione());
        cop.setImageDrawable(mActivity.getResources().getDrawable(giocoCorrente.getIdIMM()));
        // TODO Auto-generated method stub
        return vi;
    }
    }*/


}
