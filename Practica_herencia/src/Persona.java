
public class Persona {

	protected String nombre;
	protected String direccion;
	protected int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String direccion, int edad) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.edad=edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad(){
		return edad;
	}
	public boolean mayorEdad() {
		if (edad>=18) {					
		return true;
		}
		return false;
	}
	public String toString() {
		return " El/la estudiante se llama " + nombre + " , vive en " + direccion + " , tiene " + edad + " años, " + " es mayor de edad " + mayorEdad(); 
		
	}
}	

