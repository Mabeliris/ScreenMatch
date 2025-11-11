package com.aluraproyectos.screeenmatch.calculos;

import com.aluraproyectos.screeenmatch.modelo.Pelicula;
import com.aluraproyectos.screeenmatch.modelo.Titulo;

public class CalculadoraDeTiempo {

    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal+=titulo.getDuracionEnMinutos();
    }
}
