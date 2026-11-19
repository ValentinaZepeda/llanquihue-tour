package app;

import service.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el gestor de datos (que ahora está en el paquete service)
        GestorDatos gestor = new GestorDatos();
        
        // Definimos la NUEVA ruta del archivo (ahora está en la carpeta util)
        String rutaArchivo = "src/util/tours.txt";
        
        // Cargamos los datos
        ArrayList<Tour> todosLosTours = gestor.leerTours(rutaArchivo);
        
        // Recorrido: Mostramos la lista completa (incluyendo a los guías)
        System.out.println("    SISTEMA LLANQUIHUE TOUR    ");
        System.out.println("    LISTA COMPLETA DE EXCURSIONES    ");
        for (Tour t : todosLosTours) {
            System.out.println(t.toString());
        }
        
        // Búsqueda simple: Buscar tours que se realicen en "Llanquihue"
        System.out.println("\n    RESULTADO DE BUSQUEDA: TOURS EN LLANQUIHUE    ");
        boolean encontrado = false;
        
        for (Tour t : todosLosTours) {
            // Usamos equalsIgnoreCase para que no importe si está en mayúsculas o minúsculas
            if (t.getUbicacion().equalsIgnoreCase("Llanquihue")) {
                System.out.println(t.toString());
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron tours en esa ubicación.");
        }
    }
}