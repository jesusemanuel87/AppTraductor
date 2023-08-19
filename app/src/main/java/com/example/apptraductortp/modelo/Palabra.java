package com.example.apptraductortp.modelo;

import java.io.Serializable;

public class Palabra implements Serializable {

    private String palabra;
    private String traduccion;
    private int imagen;

    public Palabra(String palabra,String traduccion, int imagen) {
        this.palabra = palabra;
        this.traduccion = traduccion;
        this.imagen = imagen;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
