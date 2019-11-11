package modelo;

public class Horario {
  private Materia materia;
  private String turno;
  
  public Horario(Materia materia, String turno) {
    this.materia = materia;
    this.turno = turno;
  }
  
  public Horario(String nombre, String semestre, String turno) {
    this.materia = new Materia(nombre, semestre);
    this.turno = turno;
  }
  
  public Materia getMateria() {
    return materia;
  }

  public void setMateria(Materia materia) {
    this.materia = materia;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }
  
  public Materia crearMateria(String nombre, String semestre) {
    Materia mat = new Materia(nombre, semestre);
    return mat;
  }
  
  /**Método equals.*/
  public Boolean equals(Horario horario) {
    Boolean igual;
    Materia materia = horario.getMateria();
    igual = this.materia.equals(materia);
    return igual;
  }

  /**Método toString.**/
  public String toString() {
    String cad = "";
    cad += materia.toString();
    cad += " " + turno;
    return cad;
  }
}
