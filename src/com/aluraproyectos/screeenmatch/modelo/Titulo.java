package com.aluraproyectos.screeenmatch.modelo;

public class Titulo {

    private String nombre;
    private int duracionEnMinutos;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private  double sumatoria;
    private int totalDeEvaluaciones;

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTotalDeEvaluaciones(){
        return  totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es " + nombre);
        System.out.println("y su fecha de lanzamiento fue " + fechaDeLanzamiento);
        System.out.println("su duracion es " + duracionEnMinutos);
        System.out.println("su puntuacion es " + sumatoria);


    }

    public void evaluacion(double nota  ){
        sumatoria += nota;
        totalDeEvaluaciones++;
    }

    public double calculoMedia(){
        return sumatoria/totalDeEvaluaciones;
    }
}
