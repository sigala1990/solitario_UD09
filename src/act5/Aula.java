package act5;

import java.util.ArrayList;
import java.util.List;

import act5.Persona.Genero;
import act5.Profesor.Materia;

public class Aula {
	
	/*public enum Materia{
		mates,
		filo,
		fisica
	}*/
	
	private int id;
	private int cantidadAlumnos;
	private Materia materia;
	private Profesor profesor;
	private List<Estudiante> estudiantes;
	private boolean seRealizaClase;//si es true mostramos las notas
	
	
	
	public Aula(int id, int cantidadAlumnos, Materia materia) {
		super();
		this.id = id;
		this.cantidadAlumnos = cantidadAlumnos;
		this.materia = materia;
		this.profesor = crearProfesor();
		this.estudiantes = crearArrayEstudiantes();
		//this.seRealizaClase = hacemosClase();
		mensajeFinal();
	}
	
	/*CONDICIONES
	 *  Necesita que el profe este disponible
	 *  Que la materia del profe sea la misma que la aula
	 *  Que haya mas del 50% de alumnos
	 *  Si se puede dar clase 
	 *  	mostrar alumnos 
	 *  	mostrar alumnas
	 *  	mostrar alumnos aprobados
	 *  	mostrar alumnas aprobadas
	 */
	
	@Override
	public String toString() {
		return "Aula [id=" + id + ", cantidadAlumnos=" + cantidadAlumnos + ", materia=" + materia + ", profesor="
				+ profesor + ", estudiantes=" + estudiantes + ", seRealizaClase=" + seRealizaClase + "]";
	}

	public Profesor crearProfesor() {
		Profesor profesor = new Profesor();
		return profesor;
	}
	
	public List<Estudiante> crearArrayEstudiantes(){
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		for (int i = 0; i < cantidadAlumnos;i++) {
			Estudiante estudiante = new Estudiante();
			estudiantes.add(estudiante);
		}
		return estudiantes;
	}
	public void mensajeFinal() {
		if(hacemosClase()) {
			System.out.println("Grupo notas chicos\n");
			for (int i = 0; i < estudiantes.size(); i++) {
				if(estudiantes.get(i).novillos && estudiantes.get(i).getSexo() == Genero.H) {
					System.out.println(estudiantes.get(i).nombre +" saco una nota de "+ estudiantes.get(i).calificacionAleatoria());
				}
			}
			System.out.println("\nGrupo notas chicas\n");
			for (int i = 0; i < estudiantes.size(); i++) {
				if(estudiantes.get(i).novillos && estudiantes.get(i).getSexo() == Genero.M) {
					System.out.println(estudiantes.get(i).nombre +" saco una nota de "+ estudiantes.get(i).calificacionAleatoria());
				}
			}
		}
	}
	 
	public boolean hacemosClase()  {
		boolean hacemosClase = true;
		String text = "No se puede hacer clase por: \n\n";
		if(!profesorCoincidaMateria()){
			text += "El profesor no coincide con la materia\n";
			hacemosClase = false;
		}if(profesor.novillos) {
			text += "El profesor no esta disponible\n";
			hacemosClase = false;
		}if(!asistenciaMitadClase()) {
			text += "La mitad de alumnos no estan";
			hacemosClase = false;
		}
		if(!hacemosClase) {
			System.out.println(text); //mensaje de que no se hace clase
		}
			return hacemosClase;
	}
	
	public boolean profesorCoincidaMateria() {
		if(materia.compareTo(profesor.materiaRandom()) == 0){
			
		//if(this.materia == this.profesor.materiaRandom()) { //tipo de profe
			System.out.println(materia.ordinal() +"-----"+ profesor.materiaRandom().ordinal()+" true");
			return true; //coinciden en la asignatura
		}
		System.out.println(materia.ordinal() +"-----"+ profesor.materiaRandom().ordinal()+" false");
		return false;
	}
	
	
	
	public boolean asistenciaMitadClase() {
		int controlAsistencia = 0;
		int mitadAlumnos = cantidadAlumnos;
		for (int i = 0; i < this.estudiantes.size(); i++) {
			if(this.estudiantes.get(i).novillos) {//asiste a clase ?
				controlAsistencia++;
			}
		}			
		if((mitadAlumnos/2) < controlAsistencia) {
			return true;
		}
		return false;
		
	}
	
	/*
	public boolean isfilo(Materia materia) {
		if(materia == Materia.filo) {
			return true;
		}return false;
	}
	
	public boolean isfisica(Materia materia) {
		if(materia == Materia.fisica) {
			return true;
		}return false;
	}
	
	public boolean isMates(Materia materia) {
		if(materia == Materia.mates) {
			return true;
		}return false;
	}
	*/
	
	/*public Materia materiaRandom() {
		int random = (int) (Math.random()* (3-1)+1);
		switch (random) {
		case 1:
			return Materia.mates;
		case 2:
			return Materia.filo;
		case 3:
			return Materia.fisica;
		}
		return null;			
	}*/
}
