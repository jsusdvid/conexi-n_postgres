
public class Crudalumnos {
		 
		private int id;
		
		private String cedula;
		private String nombre;
		private String apellido;
		
		public Crudalumnos () {
		}
		
		public Crudalumnos(String carrera, String nombre, String apellido) {
			this.id = id;
			this.carrera = carrera;
			this.nombre = nombre;
			this.apellido = apellido;
		}
	 
		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;
		}
	 
		public String getcarrera() {
			return carrera;
		}
	 
		public void setcarrera(String carrera) {
			this.carrera = carrera;
		}
	 
		public String getNombre() {
			return nombre;
		}
	 
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	 
		public String getApellido() {
			return apellido;
		}
	 
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
	
		public String toString() {
			return this.id+", "+this.carrera+", "+this.nombre+", "+this.apellido;
		}
	}
}
