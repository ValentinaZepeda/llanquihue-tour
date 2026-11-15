package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el gestor de datos que creamos en el paso anterior
        GestorDatos gestor = new GestorDatos();
        
        // 2. Definimos la ruta de nuestro archivo de texto
        String rutaArchivo = "src/resources/tours.txt";
        
        // 3. Ejecutamos el método que lee el archivo y guardamos los resultados en una lista
        ArrayList<Tour> todosLosTours = gestor.leerTours(rutaArchivo);
        
        // 4. Recorrido: Mostramos la colección completa
        System.out.println("    LISTA COMPLETA DE TOURS    ");
        for (Tour t : todosLosTours) {
            System.out.println(t.toString());
        }
        
        // 5. Filtrado: Mostramos solo los tours que cumplan una condición
        System.out.println("\n    TOURS FILTRADOS (Precio menor a $20.000)    ");
        for (Tour t : todosLosTours) {
            if (t.getPrecio() < 20000) {
                System.out.println(t.toString());
            }
        }
    }
}