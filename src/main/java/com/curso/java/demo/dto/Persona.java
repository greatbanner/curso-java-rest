package com.curso.java.demo.dto;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona() {
        super();
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

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
}