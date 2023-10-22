package com.example.lista_cardview.models;

public class User {

    private String name;
    private String genere;
    private int image;

    public User(String name, String genere, int image) {
        this.name = name;
        this.genere = genere;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
