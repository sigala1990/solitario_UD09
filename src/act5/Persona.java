package act5;

public abstract class Persona {

	public enum Genero{H,M;}
	//var
	protected String nombre;
	protected int edad;
	protected Genero sexo;
	protected boolean novillos;
	
	
	//constructor
	public Persona() {
		super();
		this.nombre = nombreAleatorio(nombreMujer(), nombreHombre());
		this.edad = edadAleatoria();
		this.sexo = sexoAleatorio();
	}
	
	
	private String[] nombreMujer() {
		String[] lista = {"mari","pepa", "patri", "ivet"};
		return  lista;
	}
	private String[] nombreHombre() {
		String[] lista = {"jose","manuel", "manu","valentin"};
		return  lista;
	}
	
	private String nombreAleatorio(String[] nombreMujer, String[] nombreHombre) {
			
		int random = (int) (Math.random()* (4-1)+1);
		int random2 = (int) (Math.random()* (4-1)+1);
		
		if(random < 2) {
			return nombreMujer[random2];
		}else {
			return nombreHombre[random2];
		}
	}
	
	private Genero sexoAleatorio() {
		int random = (int) (Math.random()* (3-1)+1);
		if(random == 1) {
			return Genero.H;
		}
		return Genero.M;
	}
	
	public  abstract int edadAleatoria();//metodo abstracto se define en sus Hijos
	public  abstract boolean ausencia();

	//	get set
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Genero getSexo() {
		return sexo;
	}


	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}


	public boolean isNovillos() {
		return novillos;
	}


	public void setNovillos(boolean novillos) {
		this.novillos = novillos;
	}
	
}
