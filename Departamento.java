import java.util.HashSet;

public class Departamento {

	String nombre;
	
	public Departamento (String nombre) {
		this.nombre = nombre;
	}
	
	
	Universidad universidad;
	
	HashSet<Profesor> profesores = new HashSet<Profesor>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
	
	}


