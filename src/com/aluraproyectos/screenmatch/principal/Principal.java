package com.aluraproyectos.screenmatch.principal;

import com.aluraproyectos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluraproyectos.screenmatch.calculos.FiltroRecomendacion;
import com.aluraproyectos.screenmatch.modelo.Episodio;
import com.aluraproyectos.screenmatch.modelo.Pelicula;
import com.aluraproyectos.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula("La bella y la bestia",1990);
        miPelicula.setDuracionEnMinutos("90");
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evaluacion(7.6);
        miPelicula.evaluacion(5.1);
        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculoMedia());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        System.out.println("*************************");

        Serie serie= new Serie("La casa de cera",1998);
        serie.setTemporada(3);
        serie.setEpisodiosPorTemporada(25);
        serie.setMinutosPorEpisodio(45);
        serie.evaluacion(7.6);
        serie.evaluacion(5.1);
        serie.muestraFichaTecnica();


        Episodio episodio=new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);




        System.out.println("tiene una clasificacion de " + episodio.getClasificacion());


        var peliculaRecreo= new Pelicula("Recreo",2018);

        peliculaRecreo.setDuracionEnMinutos("95");

        peliculaRecreo.evaluacion(8.0);
        peliculaRecreo.evaluacion(5.1);
        peliculaRecreo.muestraFichaTecnica();

        System.out.println(peliculaRecreo.getTotalDeEvaluaciones());
        System.out.println(peliculaRecreo.getDuracionEnMinutos());
        System.out.println(peliculaRecreo.calculoMedia());

        //agregar ArrayList

        ArrayList<Pelicula>listaDePeliculas=new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaRecreo);

        System.out.println("Tamaño de la lista es " + listaDePeliculas.size());

        System.out.println("La primera pelicula dela lista es " + listaDePeliculas.getFirst());


    }
}
