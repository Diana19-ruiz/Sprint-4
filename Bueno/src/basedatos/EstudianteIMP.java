package basedatos;

import modelo.Estudiante;
import modelo.Historiales;
import modelo.UsuarioEstudiante;
import modelo.UsuarioHallado;

public interface EstudianteIMP {
  public int insertar(Estudiante estudiante);
  public int insertarHistorial(Historiales historial);
  public UsuarioHallado consultar(UsuarioEstudiante usuario);
  public int insertarUsuario(UsuarioEstudiante usuario);
}
