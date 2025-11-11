import com.aluraproyectos.screeenmatch.calculos.CalculadoraDeTiempo;
import com.aluraproyectos.screeenmatch.calculos.FiltroRecomendacion;
import com.aluraproyectos.screeenmatch.modelo.Episodio;
import com.aluraproyectos.screeenmatch.modelo.Pelicula;

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

    }
}
