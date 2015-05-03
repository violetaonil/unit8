package unit8.unit8;

public class Profesor extends Persona{
	
	int salario;
	
	public Profesor(String nombre, String dni)
	{
		super(nombre, dni);
	}
	
	public boolean esProfesor()
	{
		return true;
	}
	
	public int getSalario(){
		return salario;
	}
	
	public void setSalario(int salario){
		this.salario = salario;
	}

}
