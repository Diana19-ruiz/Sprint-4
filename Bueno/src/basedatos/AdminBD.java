package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminBD {
  private String url;
  private String usuario;
  private String contra;
  private String esquema;
  private String host;
  private String puerto;
  private String baseDatos;
  
  
  /**Constructor.*/
  public AdminBD() {
    esquema = "jdbc:postgresql:";
    host = "127.0.0.1";
    puerto = "5432";
    baseDatos = "Horarios";
    url =esquema+"//"+host + ":"+puerto+"/"+baseDatos;
    usuario = "postgres";
    contra = "p057gr35";
  }
  
  /**Da la conexión a la base de datos.*/
  public Connection dameConexion() {
    Connection conexion = null;
    try {
      conexion = DriverManager.getConnection(url, usuario, contra);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
    return conexion;
  }
  
  /**Cierra la conexion.*/
  public void cerrarConexion(Connection conexion) {
    try {
      if (conexion != null) {
        conexion.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
}
