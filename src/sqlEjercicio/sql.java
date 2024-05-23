package sqlEjercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class sql {
	
	public static void crearColumnaSQL(int id, String nombre, float peso) {
		 nombre = "Nombre del currante: "+nombre+"\nId: "+id;
		 JOptionPane.showMessageDialog(null, nombre);
			String url = "jdbc:mysql://localhost:3306/proyectojava";
			try {
			Connection c = DriverManager.getConnection(url, "root", "1234"); //Creamos conexion
			String ordenSQL ="INSERT INTO paquete (idPaquete, nombrePaquete, pesoPaquete) VALUES (?,?,?)";
			PreparedStatement ps = c.prepareStatement(ordenSQL);
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setFloat(3, peso);
			ps.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
			}
	}
}
