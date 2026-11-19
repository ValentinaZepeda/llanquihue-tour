package model;

//Clase que representtará a un guía turístico de la agencia. Esta se utilizará como composición dentro de la clase tour.
public class Guia {
    private String nombreCompleto;
    private String especialidad;
    
    //Constructor
    public Guia (String nombreCompleto, String especialidad){
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }
    
    //Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Guia{" + "nombreCompleto=" + nombreCompleto + ", especialidad=" + especialidad + '}';
    }
    
    
}
