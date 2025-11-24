package com.aluraproyectos.screenmatch.modelo;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable <Titulo> {

    @SerializedName("Title")
    private String nombre;

    @SerializedName("Runtime")
    private String duracionEnMinutos;

    @SerializedName("Year")
    private int fechaDeLanzamiento;


    private boolean incluidoEnElPlan;
    private  double sumatoria;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public double getSumatoria() {
        return sumatoria;
    }

    public int getDuracionEnMinutos() {


        return Integer.parseInt(duracionEnMinutos.replaceAll("\\D+", ""));
    }

    public void setDuracionEnMinutos(String duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTotalDeEvaluaciones(){
        return  totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Mi titulo es " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Puntuación: " + sumatoria);
    }


    public void evaluacion(double nota  ){
        sumatoria += nota;
        totalDeEvaluaciones++;
    }

    public double calculoMedia(){
        return sumatoria/totalDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", duracionEnMinutos=" + duracionEnMinutos +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento ;
    }
}
