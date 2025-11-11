package com.aluraproyectos.screeenmatch.modelo;

import com.aluraproyectos.screeenmatch.calculos.Clasificacion;

public class Serie extends Titulo  {

    int temporada;
    int epissodiosPorTemporada;
    int minutosPorEpisodio;
    private int totalVisualizaciones;

    @Override
    public int getDuracionEnMinutos() {
        return temporada * epissodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpissodiosPorTemporada() {
        return epissodiosPorTemporada;
    }

    public void setEpissodiosPorTemporada(int epissodiosPorTemporada) {
        this.epissodiosPorTemporada = epissodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }



}
