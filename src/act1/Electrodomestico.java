package act1;

public class Electrodomestico {
	
	//const
	public final double  preciobaseDefault = 100;
	public final double  pesoDefault = 5;
	public final Color  colorDefault= Color.blanco;
	public final ConsumoEnergetico consumoEnergeticoDefault = ConsumoEnergetico.F;
	
	//enum
	protected enum Color{
		blanco,negro, rojo, azul,gris;
	}
	protected enum ConsumoEnergetico{
		A,B,C,D,E,F;
	}
	
	//var
	protected double precioBase;
	protected Color color;
	protected ConsumoEnergetico consumoEnergetico;
	protected double peso;
	
	//constructor
	public Electrodomestico(){
		this.precioBase = preciobaseDefault;
		this.peso = pesoDefault;
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;		
	}
	
	public Electrodomestico(double preciobase, double peso){
		this.precioBase = preciobase;
		this.peso = peso;
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
	}
	
	public Electrodomestico(double preciobase, double peso, String color, char consumoEnergetico){
		this.precioBase = preciobase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}
	
	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
	
	
	//metodos propios
	public Color randomColor() {
		int numRandom = numRandom(5,1);
		switch (numRandom) {
		case 1:
			return Color.blanco;
		case 2:
			return Color.negro;
		case 3:
			return Color.rojo;
		case 4:
			return Color.azul;
		case 5:
			return Color.gris;
		default:
			return null;
		}
	}
	
	public ConsumoEnergetico randomConsumoEnergetico() {
		int numRandom = numRandom(6,1);
		switch (numRandom) {
		case 1:
			return ConsumoEnergetico.A;
		case 2:
			return ConsumoEnergetico.B;
		case 3:
			return ConsumoEnergetico.C;
		case 4:
			return ConsumoEnergetico.D;
		case 5:
			return ConsumoEnergetico.E;
		case 6:
			return ConsumoEnergetico.F;
		default:
			return null;
		}
	}
	
	public ConsumoEnergetico comprobarConsumoEnergetico(char consumoEnergetico) {
		switch (String.valueOf(consumoEnergetico).toUpperCase()) {
		case "A":
			return ConsumoEnergetico.A;
		case "B":
			return ConsumoEnergetico.B;
		case "C":
			return ConsumoEnergetico.C;
		case "D":
			return ConsumoEnergetico.D;
		case "E":
			return ConsumoEnergetico.E;
		case "F":
			return ConsumoEnergetico.F;
		default:
			return ConsumoEnergetico.F;
		}
	}
	public Color comprobarColor(String color) {
		switch (color.toUpperCase()) {
		case "BLANCO":
			return Color.blanco;
		case "NEGRO":
			return Color.negro;
		case "AZUL":
			return Color.azul;
		case "ROJO":
			return Color.rojo;
		case "GRIS":
			return Color.gris;
		default:
			return Color.blanco;
		}
	}
	
}
