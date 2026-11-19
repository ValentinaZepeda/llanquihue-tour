package model;

//Clase que reprasentará un tour de la agencia, implementa una relación una relación de composición al contener un objeto de tipo tipo Guia-
public class Tour{
    private String nombre;
    private String ubicacion;
    private int precio;
    //aqui está la composición, el tour tiene un guía en su interior. 
    private Guia guiaAsignado;
    
    public Tour(String nombre, String ubicacion, int precio, Guia guiaAsignado){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.guiaAsignado = guiaAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio>0){
        this.precio = precio;
    }else{
            System.out.println("Error: El precio no puedo ser negativo o cero");
        }    
    }    

    public Guia getGuiaAsignado() {
        return guiaAsignado;
    }

    public void setGuiaAsignado(Guia guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    @Override
    public String toString() {
        return "Tour{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", precio=" + precio + ", guiaAsignado=" + guiaAsignado + '}';
    }
    
    
}