package com.aluraproyectos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("Muy bien evaluado en el momneto");
        } else if (clasificacion.getClasificacion()>=2) {
            System.out.println("Buena evaluacion en su momento");
        }else{
            System.out.println(("Agregar para verlo después"));
        }
    }
}
