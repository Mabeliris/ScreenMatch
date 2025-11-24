package com.aluraproyectos.screenmatch.principal;

import com.aluraproyectos.screenmatch.modelo.Pelicula;
import com.aluraproyectos.screenmatch.modelo.Serie;
import com.aluraproyectos.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula("La bella y la bestia",1990);
        var peliculaRecreo= new Pelicula("Recreo",2001);
        Serie serie= new Serie("La casa de cera",1998);


        ArrayList<Titulo> lista=new ArrayList<>();
        lista.add(miPelicula);
        lista.add(peliculaRecreo);
        lista.add(serie);

       /* for (Titulo item : lista) {
            System.out.println(item);

        }*/

        lista.forEach(System.out::println);

        ArrayList<String>listaDeCuentos= new ArrayList<>();
        listaDeCuentos.add("Cenicienta");
        listaDeCuentos.add("Blanca Nieves");
        listaDeCuentos.add("Pulgarcito");
        listaDeCuentos.add("Pinoccio");
        listaDeCuentos.add("Aladin");

        Collections.sort(listaDeCuentos);

        System.out.println("Lista de cuentos ordenada: " + listaDeCuentos);

        Collections.sort(lista);

        System.out.println("Lista ordenada de peliculas por titulo: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Ordenar lista por fechas de lanzamiento " + lista);




    }
}
