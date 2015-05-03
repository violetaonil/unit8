package unit8.unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class Persona {

	protected ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	protected String nombre;
	protected String dni;
	
	public Persona(String nombre, String dni)
	{
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void anyadirAsignatura(Asignatura a)
	{
		asignaturas.add(a);
	}
	
	abstract boolean esProfesor();
	
	public void mostrarListadoAsignaturasNota()
	{
		Asignatura a;
		System.out.println("Nombre del alumno: " + nombre + " está matriculado en la asignatura: ");
		for(int i=0; i<asignaturas.size(); i++)
		{
			a = asignaturas.get(i);
			String nombreAsig = a.getNombre();
			double notaAsig = a.getNota();
			System.out.println(nombreAsig + " y su nota es: " + notaAsig);
		}
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getDni()
	{
		return dni;
	}
	
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	public ArrayList<Asignatura> getAsignaturas()
	{
		return asignaturas;
	}
	
	public void ordenarPorAsignaturas()
	{
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura a1, Asignatura a2) {
				return a1.getNombre().compareTo(a2.getNombre());
			}
			
		});
		
		for(int i=0; i<asignaturas.size(); i++)
		{
			System.out.println(asignaturas.get(i).getNombre());
		}
		
	}
	
	public void ordenarPorNota()
	{
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura a1, Asignatura a2) {
				return new Double(a1.getNota()).compareTo(new Double(a2.getNota()));
			}
			
		});
		
		for(int i=0; i<asignaturas.size(); i++)
		{
			System.out.println(asignaturas.get(i).getNota());
		}
	}
}
