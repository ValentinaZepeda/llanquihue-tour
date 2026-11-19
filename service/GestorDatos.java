package service;

import model.Tour;
import model.Guia; // Agregué la clase Guia
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Bloque try-catch 
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                // Ahora esperamos 5 datos en el archivo de texto
                if (partes.length == 5) {
                    String nombre = partes[0];
                    String ubicacion = partes[1];
                    int precio = Integer.parseInt(partes[2]);
                    
                    // Extraemos los nuevos datos para el guía
                    String nombreGuia = partes[3];
                    String especialidadGuia = partes[4];

                    // Primero creamos el objeto Guia 
                    Guia nuevoGuia = new Guia(nombreGuia, especialidadGuia);
                    
                    // Luego creamos el Tour pasándole el Guia que acabamos de crear (Composición)
                    Tour nuevoTour = new Tour(nombre, ubicacion, precio, nuevoGuia);
                    
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Un catch extra para validar que el precio sea realmente un número
            System.out.println("Error en el formato numérico del archivo.");
        }

        return listaTours;
    }
}
