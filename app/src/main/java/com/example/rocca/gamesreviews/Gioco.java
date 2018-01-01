package com.example.rocca.gamesreviews;

/**
 * Created by Rossi on 01/01/2018.
 */

public class Gioco {
    private String nome;
    private String descrizione;
    private int idIMM;

    public Gioco(String titolo, String descrizione, int id) {
        this.nome = titolo;
        this.descrizione = descrizione;
        this.idIMM=id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String titolo) {
        this.nome = titolo;
    }

    public int getIdIMM() {
        return idIMM;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
