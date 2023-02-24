package com.generation.programacioobjetos.models;

//aqui yo estoy indicando que Gato hereda los atributos y métodos de Animal :D
public class Gato extends Animal {

    public Integer cantBigotes;

    //el constructor por defecto de una clase hija debe tener la funcion super()
    //Para asi obtener los datributos de Animal
    public Gato() {
        super();
    }

    public Gato(String nombre, String raza, String pelaje, Boolean vacunado, Integer cantBigotes) {
        super(nombre, raza, pelaje, vacunado);
        this.cantBigotes = cantBigotes;
    }


    public Integer getCantBigotes() {
        return cantBigotes;
    }

    public void setCantBigotes(Integer cantBigotes) {
        this.cantBigotes = cantBigotes;
    }

    public void maullar(){
        System.out.println("Miau uwu :3");
    }

    @Override
    public String toString() {
        //concatenamos el toString desde Animal
        //esto hay que hacerlo a mano
        return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
    }

    
    

    
}
