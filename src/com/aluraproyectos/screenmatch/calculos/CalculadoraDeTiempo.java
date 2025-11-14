package com.aluraproyectos.screenmatch.calculos;

import com.aluraproyectos.screenmatch.modelo.Titulo;

public class CalculadoraDeTiempo {

    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal+=titulo.getDuracionEnMinutos();
    }
}
