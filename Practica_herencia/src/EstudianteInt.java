
public class EstudianteInt extends Estudiante {

	public EstudianteInt(String nombre, String direccion, int edad, String codigo) {
		super(nombre, direccion, edad, codigo);
	}
	
	private boolean esErasmus;
	private String nacionalidad;
	
	public EstudianteInt() {
		
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad=nacionalidad;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
		
	}
	private boolean esEuropeo() {
		if (nacionalidad=="americano")
			return false;
		if (nacionalidad=="americana")
			return false;
		else 
			return true;
	}
	
	public void setEsErasmus(boolean esErasmus) {
		if (nacionalidad=="americano")
			esErasmus= false;
		if (nacionalidad=="americana")
			esErasmus= false;
		else 
			esErasmus= true;
	}
	public boolean getEsErasmus() {
		if (nacionalidad=="americano")
			return  false;
		if (nacionalidad=="americana")
		return  false;
		else 
			return  true;
	}
	public boolean descuentoParaJovenes() {
		if (getEsErasmus()==true && edad<25) {
		return true;
		}
		else 
			return false;
		
	}
	
	public String toString() {
		return super.toString()+ " la nacionalidad es " + nacionalidad + " , es europeo: " + esEuropeo()  +  ", es estudiante de erasmus: "  + getEsErasmus() + 
				" . Tiene descuento para jóvenes: " + descuentoParaJovenes();
}
}
