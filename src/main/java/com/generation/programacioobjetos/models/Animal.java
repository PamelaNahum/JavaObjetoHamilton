package com.generation.programacioobjetos.models;


public class Animal {
    public String nombre;
    public String raza;
    public String pelaje;
    public Boolean vacunado;

    
    public Animal() {
    }


    public Animal(String nombre, String raza, String pelaje, Boolean vacunado) {
        this.nombre = nombre;
        this.raza = raza;
        this.pelaje = pelaje;
        this.vacunado = vacunado;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getPelaje() {
        return pelaje;
    }


    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }


    public Boolean getVacunado() {
        return vacunado;
    }


    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void caminar (){
        System.out.println("Caminar, CAMINAR! ");
    }


    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", vacunado=" + vacunado + "]";
    }
    
}
