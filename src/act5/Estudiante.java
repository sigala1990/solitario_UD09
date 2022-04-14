package act5;

public class Estudiante extends Persona {
	
	 private double calificacion;

	
	public Estudiante() {
		super();
		this.calificacion = calificacionAleatoria();
		this.edad = edadAleatoria();
		this.novillos = ausencia();
	}
	
	public int calificacionAleatoria() {
		return (int) (Math.random()* (10-0)+0);		
	}
	
	public int edadAleatoria(){//metodo abstracto se define en sus Hijos
		return (int) (Math.random()* (18-15)+15);	
	}
	
	public boolean ausencia(){
		int asistencia = (int) (Math.random()* (3-1)+1);
		//System.out.println(asistencia);
		if(asistencia == 2) {// 50% ausente
			return true;
		}
		return false;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	
}
