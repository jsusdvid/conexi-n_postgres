import java.sql. *;

public class conexion {
	
		public static void main(String[] args) {
			
		
		
			
		try {
			//Creamos la Conexion
			Conection miconexion =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgred","postgrest","elimora");
					
			//objeto de tipo Statement
			Statement miStatement=miconexion.createStatement();
			
			// Instruccion sql
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM estudiantes");
			
			//Recorrer el ResultSet
					
			while(miResultSet.next()) {
				
				System.out.println("Nombre: "+ miResultSet.getString("Nombre") + ", Apellido:" + miResultSet.getString("Apellido")+ ", Carrera: " + miResultSet.getString("Carrera"));
					
				
			}catch(Exception e) {
				
				System.out.println("No conecta");
				e.printStackTrace();
			} 
			
		}
}
