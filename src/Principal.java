import com.aluraproyectos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluraproyectos.screenmatch.calculos.FiltroRecomendacion;
import com.aluraproyectos.screenmatch.modelo.Episodio;
import com.aluraproyectos.screenmatch.modelo.Pelicula;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        Pelicula miPelicula=new Pelicula();
        miPelicula.setNombre("La bella y la bestia");
        miPelicula.setFechaDeLanzamiento(1990);
        miPelicula.setDuracionEnMinutos(90);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evaluacion(7.6);
        miPelicula.evaluacion(5.1);
        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.getDuracionEnMinutos());
        System.out.println(miPelicula.calculoMedia());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio=new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de cera");
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);


        var peliculaRecreo= new Pelicula();
        peliculaRecreo.setNombre("Recreo");
        peliculaRecreo.setDuracionEnMinutos(83);
        peliculaRecreo.setFechaDeLanzamiento(2001);

        //agregar ArrayList

        ArrayList<Pelicula>listaDePeliculas=new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaRecreo);

        System.out.println("Tamaño de la lista es " + listaDePeliculas.size());
        System.out.println(listaDePeliculas.toString());
        System.out.println("La primera pelicula dela lista es " + listaDePeliculas.getFirst());


    }
}
