package basedatos;

import java.util.ArrayList;

import modelo.Inscripcion;

public interface InscripcionDAO {
  public int insertar(Inscripcion inscripcion, String matricula, int i);
  
  public int borrar(Inscripcion inscripcion);
  
  public ArrayList<Inscripcion> consultar();
}
