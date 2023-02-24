package com.generation.programacioobjetos.models;

public class Conejo extends Animal {

    public Double logitudOrejas;

    public Conejo() {
        super();
    }

    public Conejo(String nombre, String raza, String pelaje, Boolean vacunado, Double logitudOrejas) {
        super(nombre, raza, pelaje, vacunado);
        this.logitudOrejas = logitudOrejas;
    }

    public Double getLogitudOrejas() {
        return logitudOrejas;
    }

    public void setLogitudOrejas(Double logitudOrejas) {
        this.logitudOrejas = logitudOrejas;
    }

    public void saltarAlto(){
        System.out.println("Brinco Brinco");
    }

    @Override
    public String toString() {
        return super.toString() + "Conejo [logitudOrejas=" + logitudOrejas + "]";
    } 

    

    
    
    
}
