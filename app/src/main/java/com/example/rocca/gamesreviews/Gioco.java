package com.example.rocca.gamesreviews;

/**
 * Created by Rossi on 01/01/2018.
 */

public class Gioco {
    private String nome;
    private String descrizione;

    public Gioco(String titolo, String descrizione) {
        this.nome = titolo;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String titolo) {
        this.nome = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
