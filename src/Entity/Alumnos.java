package Entity;

public class Alumnos {

	private String matricula; //Este sera la llave para el HashMap
	private String nombre;
	private int numCel;
	private int edad;
	
	
	public Alumnos(String matricula, String nombre, int numCel, int edad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.numCel = numCel;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Alumnos [matricula=" + matricula + ", nombre=" + nombre + ", numCel=" + numCel + ", edad=" + edad + "]\n";
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumCel() {
		return numCel;
	}


	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
}
