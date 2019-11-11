package modelo;

import java.util.ArrayList;


public class Historias {
  private ArrayList<Historiales> historiales;
  
  public Historias() {
    historiales = new ArrayList<Historiales>();
  }
  
  public void agregarHorario(Historiales historial) {
    historiales.add(historial); // se agrega un horario a la lista
  }
  
  public Historiales crearHistorial(String semestre, String matricula, String cve_materia, String status) {
    Historiales historial = new Historiales(semestre, matricula, cve_materia, status);
    return historial;
  }
  
  /**Se verifica que no se repitan las materias.*/
  public Boolean equals(Historiales historial) {
    Boolean band = false;
    for (int i = 0; i < historiales.size(); i++) {
      if (historiales.get(i).equals(historial)) {
        band = true;
        break;
      }
    }
    return band;
  }
  
  public int getTam() {
    return historiales.size();
  }

  /**Método toString.*/
  public String toString() {
    String cad = "";
    for (int i = 0; i < historiales.size(); i++) {
      cad += historiales.get(i).toString();
      cad += "\n";
    }
    return cad;
  }
  
  public Historiales dameHistorial(int i) {
    return historiales.get(i);
  }
  
}
