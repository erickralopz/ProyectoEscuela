package Interface;

import Entity.Alumnos;

public interface Metodos {

	public void guarda(Alumnos alumno);
	
	public void mostrar();
	
	public Alumnos buscar(String matricula);
	
	public void editar(Alumnos alumno);
	
	public void eliminar(String matricula);
	
	
}
