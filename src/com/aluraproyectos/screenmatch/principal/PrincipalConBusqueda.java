package com.aluraproyectos.screenmatch.principal;

import com.aluraproyectos.screenmatch.modelo.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        var busqueda = lectura.nextLine();

        String clave = "e69f1b7b";
        String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey="+clave;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json=response.body();
        System.out.println(json);

        Gson gson= new Gson();

        // Deserialization
        Titulo miTitulo = gson.fromJson(json, Titulo.class);
        System.out.println(miTitulo);

    }
}
