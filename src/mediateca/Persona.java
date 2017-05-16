/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author gipao
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;
    private int prestamos = 0;
    private TipoDeSoporte[] articulosP;

    public Persona(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.articulosP = new TipoDeSoporte[3];
    }

    public TipoDeSoporte[] getArticulosP() {
        return articulosP;
    }

    public void agregarArticulo(TipoDeSoporte articuloP) {
        this.articulosP[prestamos++] = articuloP;
    }

    public void quitarArticulo(TipoDeSoporte articuloP) {
        this.articulosP[prestamos--] = articuloP;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }

}
