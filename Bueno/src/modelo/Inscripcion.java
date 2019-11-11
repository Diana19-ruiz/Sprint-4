package modelo;

import java.util.ArrayList;


public class Inscripcion {
  private ArrayList<Horario> horarios;
  
  public Inscripcion() {
    horarios = new ArrayList<Horario>();
  }
  
  public void agregarHorario(Horario horario) {
    horarios.add(horario); // se agrega un horario a la lista
  }
  
  public Horario crearHorario(String nombre, String semestre, String turno) {
    Horario horario = new Horario(nombre, semestre, turno);
    return horario;
  }
  
  /*Elimina un horario.**/
  public void eliminarHorario(int fila) {
    horarios.remove(fila);
    
  }
  
  public void eliminarHorarios() {
    horarios.clear();
  }
  
  /**Se verifica que no se repitan las materias.*/
  public Boolean equals(Horario horario) {
    Boolean band = false;
    for (int i = 0; i < horarios.size(); i++) {
      if (horarios.get(i).equals(horario)) {
        band = true;
        break;
      }
    }
    return band;
  }
  
  public int getTam() {
    return horarios.size();
  }

  /**Método toString.*/
  public String toString() {
    String cad = "";
    for (int i = 0; i < horarios.size(); i++) {
      cad += horarios.get(i).toString();
      cad += "\n";
    }
    return cad;
  }
  
  public Horario dameHorario(int i) {
    return horarios.get(i);
  }
  
}
