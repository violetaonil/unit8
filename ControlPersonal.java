package unit8.unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Violeta Feliciano
 *
 */
public class ControlPersonal {
	
	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	private ControlPersonal(){
	}
	
	public static void main(String[] args) {

    	Asignatura a1 = new Asignatura("Programación", 9);
    	Asignatura a2 = new Asignatura("Entornos", 7);
    	Asignatura a3 = new Asignatura("Sistemas", 5);
    	Asignatura a4 = new Asignatura("Lenguaje de Marcas", 8);
    	Asignatura a5 = new Asignatura("Bases de datos", 5);
    	
    	Profesor pro1 = new Profesor("Nacho", "45734598D");
    	Profesor pro2 = new Profesor("Rosa", "87838483A");
    	Profesor pro3 = new Profesor("Juan Carlos", "12345678E");
    	
    	Alumno alu1 = new Alumno("Violeta", "45844661A");
    	Alumno alu2 = new Alumno("Maria", "49839221B");
    	Alumno alu3 = new Alumno("Julio", "87288722C");
    	Alumno alu4 = new Alumno("Jose", "00056768D");
    	Alumno alu5 = new Alumno("Andrea", "49343521E");
		
		pro1.anyadirAsignatura(a1);
		pro2.anyadirAsignatura(a2);
		pro3.anyadirAsignatura(a3);
		alu1.anyadirAsignatura(a1);
		alu1.anyadirAsignatura(a2);
		alu2.anyadirAsignatura(a3);
		alu3.anyadirAsignatura(a1);
		alu4.anyadirAsignatura(a2);
		alu4.anyadirAsignatura(a3);
		alu5.anyadirAsignatura(a1);
		alu5.anyadirAsignatura(a3);
		pro2.anyadirAsignatura(a4);
		alu2.anyadirAsignatura(a4);
		alu3.anyadirAsignatura(a5);
		alu4.anyadirAsignatura(a5);
		
		anyadirPersona(pro1);
		anyadirPersona(pro2);
		anyadirPersona(pro3);
		anyadirPersona(alu1);
		anyadirPersona(alu2);
		anyadirPersona(alu3);
		anyadirPersona(alu4);
		anyadirPersona(alu5);
		
		ControlPersonal cp = new ControlPersonal();
		cp.mostrarListado();	
	}
	
	public static void anyadirPersona(Persona p)
	{
		personas.add(p);
	}
	
	public void ordenarPorDNI()
	{
		Collections.sort(personas, new Comparator<Persona>(){

			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getDni().compareTo(p2.getDni());
			}
			
		});
		
		for(int i=0; i<personas.size(); i++)
		{
			System.out.println(personas.get(i).getDni());
		}
	}
	
	public void ordenarPorOrdenAlfabetico()
	{
		Collections.sort(personas, new Comparator<Persona>(){

			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre());
			}
			
		});
		
		for(int i=0; i<personas.size(); i++)
		{
			System.out.println(personas.get(i).getNombre());
		}
	}
		
	public void mostrarListado()
	{
		ControlPersonal cp = new ControlPersonal();
		cp.ordenarPorOrdenAlfabetico();
		
		for(int i=0; i<personas.size(); i++)
		{
			Persona p;
			p = personas.get(i);
			if(p.esProfesor() == false)
			{
				p.mostrarListadoAsignaturasNota();
				p.ordenarPorAsignaturas();
				p.ordenarPorNota();
			}
			else
			{
				p.ordenarPorAsignaturas();
				p.ordenarPorNota();
			}

		}
	}
	
}
