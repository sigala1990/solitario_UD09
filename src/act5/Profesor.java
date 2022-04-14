package act5;

import java.util.EnumSet;
import java.util.Random;

public class Profesor extends Persona {
	
	public enum Materia{
		mates,
		filo,
		fisica;
	}
	//ATRIBUTOS PROPIOS
	//private String queMateria;
	//private final String MATERIAS[] = {"matemáticas", "filosofia", "física"};
	private Materia materia;
	
	//CONSTRUCTORES
	public Profesor() {
		super();
		this.materia = materiaRandom();
		this.novillos = ausencia();
	}
	
	//MÉTODOS PROPIOS
	//comprobamos si el profe es ausente
	public boolean ausencia() {  //TODO especificar motivo ausencia 
		boolean ausente = false;
		//20% de probabilidad de estar ausente
		int aleatorio = (int) (Math.random() * 10 + 1);
		if(aleatorio <= 2) {
			ausente = true;
		}
		return ausente;
	}

	//asignamos la edad del profesor entre márgenes razonables
	public int edadAleatoria() {
		Random rnd = new Random();
		//la edad de profesor puede ser entre 25 y 65 años.
		int edadAleatoria = rnd.nextInt(40)+25;	
		return edadAleatoria;
	}
		
	public Materia materiaRandom() {
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
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
	
}