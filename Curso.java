import java.util.HashSet;

public class Curso {

	String nombre;
	String cod;
	
	
	public Curso (String nombre, String cod) {
		this.nombre = nombre;
	}
	
	Profesor profesor;
	HashSet<Estudiante> estudiantes = new HashSet<Estudiante>();
	
	public void setEstudiantes(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}
