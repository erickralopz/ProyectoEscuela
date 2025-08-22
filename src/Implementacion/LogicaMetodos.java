package Implementacion;

import java.util.HashMap;

import Entity.Alumnos;
import Interface.Metodos;

public class LogicaMetodos implements Metodos{

	private HashMap<String, Alumnos> hashMap = new HashMap<String, Alumnos>();
	
	
	@Override
	public void guarda(Alumnos alumno) {
		// TODO Auto-generated method stub
		hashMap.put(alumno.getMatricula(), alumno);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashMap);
	}

	@Override
	public Alumnos buscar(String matricula) {
		// TODO Auto-generated method stub
		return hashMap.get(matricula);
	}

	@Override
	public void editar(Alumnos alumno) {
		// TODO Auto-generated method stub
		hashMap.put(alumno.getMatricula(), alumno);
	}

	@Override
	public void eliminar(String matricula) {
		// TODO Auto-generated method stub
		hashMap.remove(matricula);
	}

	
}
