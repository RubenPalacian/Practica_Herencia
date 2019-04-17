
public class Estudiante extends Persona {

	public Estudiante(String nombre, String direccion, int edad, String codigo) {
		super(nombre, direccion, edad);
	}
	
	private String codigo;
	public Estudiante() {
		
	}
	public void setCodigo(String nombre) {
		
		codigo=nombre;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String toString() {
		return super.toString()+ " y tiene el codigo "  + codigo;
	}
		
	}
	

