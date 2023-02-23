package com.generation.programacioobjetos;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.programacioobjetos.models.Perro;


@SpringBootApplication
public class ProgramacioobjetosApplication {

	public static void main(String[] args) {
		//Crea un perro por defecto
		Perro perroDefault = new Perro();
		// Crear un perro con todos los atributos
		Perro perroCompleto = new Perro("Salchicha", "Café", 40.5, "Pelo duro", 'F', 1235468);

		System.out.println(perroDefault.toString());
		System.out.println(perroCompleto.toString());

		perroDefault.setRaza("Quiltro");
		perroDefault.setColor("Blanco");

		System.out.println(perroDefault.toString());

		Double tamanioPerroCompleto = perroCompleto.getTamanio();
		System.out.println(tamanioPerroCompleto);

		perroCompleto.setTamanio(50.8);
		System.out.println(perroCompleto.toString());

		ArrayList <Perro> misPerros = new ArrayList<Perro>();
		misPerros.add(perroCompleto);
		misPerros.add(perroDefault);
		System.out.println("desde aqui es el array :D");
		System.out.println(misPerros);
		misPerros.get(1).setTamanio(85.6);

		System.out.println("desde aqui es el array modificado :D");
		System.out.println(misPerros);

	}

}
