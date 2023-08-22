import java.util.HashSet;

public class Estudiante {

	String nombre;
	String cod;
	
	public Estudiante (String nombre, String cod) {
		this.nombre = nombre;
	}
	
	HashSet<Curso> cursos = new HashSet<Curso>();
	Universidad universidad;

	public void setCurso(Curso curso) {
		cursos.add(curso);
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
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	
	}

