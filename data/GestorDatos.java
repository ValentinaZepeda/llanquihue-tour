package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> leerTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String ubicacion = partes[1];
                    int precio = Integer.parseInt(partes[2]);
                    
                    Tour nuevoTour = new Tour(nombre, ubicacion, precio);
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}