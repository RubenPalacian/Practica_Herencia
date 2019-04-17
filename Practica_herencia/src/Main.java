
public class Main {

	public static void main(String[] args) {
		
		Estudiante estudiante1= new Estudiante("Laura Perez", "Avda Marítima 11", 17, "A1" );
		Estudiante estudiante2= new Estudiante("Alfonso Hernandez", "Avda Constitucion 4", 18, "A2");
		EstudianteInt estudiante3=new EstudianteInt("Marcus Stone", "Residencia de estudiantes", 19, "A3");
		EstudianteInt estudiante4=new EstudianteInt("Lucia Da Silva", "Residencia de estudiantes", 20, "A4");
		EstudianteInt estudiante5=new EstudianteInt("Jhon Smith", "Residencia de estudiantes", 25, "A5");
		
		
		estudiante1.setCodigo("A1");		
		estudiante2.setCodigo("A2");
		estudiante3.setCodigo("A3");
		estudiante4.setCodigo("A4");
		estudiante5.setCodigo("A5");
		
		estudiante3.setNacionalidad("inglés");
		estudiante4.setNacionalidad("portuguesa");
		estudiante5.setNacionalidad("americano");
		
		estudiante3.setEsErasmus(true);
		estudiante4.setEsErasmus(true);
		estudiante5.setEsErasmus(false);
		
		System.out.println(estudiante1.toString());
		System.out.println(estudiante2.toString());
		System.out.println(estudiante3.toString());
		System.out.println(estudiante4.toString());
		System.out.println(estudiante5.toString());
	}

}
