package basedatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Inscripcion;

public class InscripcionImp implements InscripcionDAO {
  private AdminBD admin;
  private Connection conexion;
  private Boolean conexionTransferida = false;
  
  public InscripcionImp() {
    admin = new AdminBD();
    conexion = null;
  }
  
  public InscripcionImp(Connection conexion) {
    this.conexion = conexion;
    this.conexionTransferida = true;
  }
  
  
  @Override  
  public int insertar(Inscripcion inscripcion, String matricula, int i) {
    int us = 0;
    PreparedStatement ps = null;
    String sql = "INSERT INTO inscripciones(matricula, cve_materia, turno) VALUES(?,?,?);";
    if (conexionTransferida == false) {
      conexion = admin.dameConexion();
    }
    try {
      ps = conexion.prepareStatement(sql);
      //Insertamos en la tabla
      ps.setString(1, matricula);
      ps.setString(2, inscripcion.dameHorario(i).getMateria().getClave());
      ps.setString(3, inscripcion.dameHorario(i).getTurno());
      us = ps.executeUpdate();
    } catch (SQLException e) {
      try {
        ps.close();
        if (conexionTransferida == false) {
          admin.cerrarConexion(conexion);
        }
      } catch (SQLException e1) {
        e1.printStackTrace();
      }
      e.printStackTrace();
    }
    
    return us;
  }

  @Override
  public int borrar(Inscripcion inscripcion) {
    return 0;
  }

  @Override
  public ArrayList<Inscripcion> consultar() {
    return null;
  }

}
