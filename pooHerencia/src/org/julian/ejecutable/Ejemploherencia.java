package org.julian.ejecutable;

import org.julian.entidades.Alumno;
import org.julian.entidades.Alumnointernacional;
import org.julian.entidades.Persona;
import org.julian.entidades.Profesor;

public class Ejemploherencia {

	public static void main(String[] args) {

		System.out.println("Creando la instancia de clase Alumno");
		Alumno alumno = new Alumno();
		
		alumno.setApellido("Macri");
		alumno.setEdad(23);
		alumno.setEmail("julian.macri@gmail.com");
		alumno.setNombre("Julian");
		
		alumno.setNotaCastellano(6.5);
		alumno.setNotaHistoria(7.0);
		alumno.setNotaMatematica(6.3);

		alumno.setInstitucion("Institucion nacional");
		
		System.out.println("Creando la instancia alumno internacional");
		Alumnointernacional alumno1 = new Alumnointernacional();
		alumno1.setApellido("Macri");
		alumno1.setEdad(23);
		alumno1.setEmail("julian.macri@gmail.com");
		alumno1.setNombre("Julian");
		alumno1.setPais("Argentina");
		alumno1.setNotaCastellano(6.5);
		alumno1.setNotaHistoria(7.0);
		alumno1.setNotaMatematica(6.3);
		alumno1.setInstitucion("Institucion nacional");
		
		System.out.println("Creando la instancia de la clase profesor");
		Profesor profesor = new Profesor();
		profesor.setNombre("analia");
		profesor.setApellido("Perez");
		profesor.setAsignatura("Lengua");
		
		imprimir(alumno);
		imprimir(alumno1);
		imprimir(profesor);
		
	}
	public static void imprimir (Persona persona) {
		System.out.println("==============");
		System.out.println("==============");
		System.out.println(persona);
		
	}
	
}


