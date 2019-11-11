package modelo;

public class Materia {
  private String nombre;
  private String semestre;
  private String clave;
  
  /**Es el contructor de la clase.*/
  public Materia(String nombre, String semestre) {
    this.nombre = nombre;
    this.semestre = semestre;
    asignarClave(nombre);
  }


  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getSemestre() {
    return semestre;
  }
  
  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }
  
  
  public String getClave() {
    return clave;
  }
  
  /**Regresa la cadena del objeto materia.*/
  public String toString() {
    String cad = "";
    cad += this.clave;
    cad += " " + this.semestre;
    cad += " " + this.nombre;
    return cad;
  }
  
  /**Verifica que dos materias sean iguales.*/
  public Boolean equals(Materia materia) {
    Boolean band = this.nombre.equals(materia.nombre) 
            && this.semestre.equals(materia.semestre);
    return band;
  }
  
  /**Asigna la clave a la materia.*/
  public void asignarClave(String nombre) {
    switch (nombre) {
      case "Análisis de algoritmos": {
        this.clave = "1-CT-IS-04";
        break;
      }
      case "Teoría de la computación": {
        this.clave = "1-CT-IS-05";
        break;
      }
      case "Construcción y evolución del software": {
        this.clave = "1-CT-IS-06";
        break;
      }
      case "Bases de datos": {
        this.clave = "1-CT-IS-07";
        break;
      }
      case "Análisis de requisitos": {
        this.clave = "1-CT-IS-08";
        break;
      }
      case "Programación web": {
        this.clave = "1-CT-IS-09";
        break;
      }
      case "Sistemas operativos": {
        this.clave = "1-CT-IS-10";
        break;
      }
      case "Aseguramiento de la calidad del software": {
        this.clave = "1-CT-IS-11";
        break;
      }
      case "Análisis y modelamiento de software": {
        this.clave = "1-CT-IS-12";
        break;
      }
      case "Programación de sistemas": {
        this.clave = "1-CT-IS-13";
        break;
      }
      case "Arquitectura de computadoras": {
        this.clave = "1-CT-IS-14";
        break;
      }
      case "Lenguajes de programación": {
        this.clave = "1-CT-IS-15";
        break;
      }
      case "Técnicas de pruebas de software": {
        this.clave = "1-CT-IS-16";
        break;
      }
      case "Diseño de software": {
        this.clave = "1-CT-IS-17";
        break;
      }
      case "Metodología de la investigación": {
        this.clave = "1-CT-IS-18";
        break;
      }
      case "Redes de computadoras": {
        this.clave = "1-CT-IS-19";
        break;
      }
      case "Normatividad y legislación": {
        this.clave = "1-CT-IS-20";
        break;
      }
      case "Arquitectura de software": {
        this.clave = "1-CT-IS-21";
        break;
      }
      case "Sistemas distribuidos": {
        this.clave = "1-CT-IS-22";
        break;
      }
      case "Administración de proyectos I": {
        this.clave = "1-CT-IS-23";
        break;
      }
      case "Métricas de software": {
        this.clave = "1-CT-IS-24";
        break;
      }
      case "Diseño de experimentos en ingeniería de software": {
        this.clave = "1-CT-IS-25";
        break;
      }
      case "Administración de proyectos II": {
        this.clave = "1-CT-IS-26";
        break;
      }
      case "Gestión tecnológica": {
        this.clave = "1-CT-IS-27";
        break;
      }
      case "Especialidad en bases de datos I": {
        this.clave = "1-CT-TB-01";
        break;
      }
      case "Especialidad en bases de datos II": {
        this.clave = "1-CT-TB-02";
        break;
      }
      case "Administración de bases de datos": {
        this.clave = "1-CT-TB-03";
        break;
      }
      case "Inteligencia de negocios": {
        this.clave = "1-CT-TB-04";
        break;
      }
      case "Inteligencia artificial": {
        this.clave = "1-CT-IA-01";
        break;
      }
      case "Seminario de inteligencia artificial I": {
        this.clave = "1-CT-IA-02";
        break;
      }
      case "Seminario de inteligencia artificial II": {
        this.clave = "1-CT-IA-03";
        break;
      }
      case "Computación móvil": {
        this.clave = "1-CT-IA-04";
        break;
      }
      case "Sistemas embebidos": {
        this.clave = "1-CT-IA-05";
        break;
      }
      case "Sistemas en tiempo real": {
        this.clave = "1-CT-IA-06";
        break;
      }
      case "XML 1": {
        this.clave = "1-CT-AW-01";
        break;
      }
      case "XML 2": {
        this.clave = "1-CT-AW-02";
        break;
      }
      case "Mapeo objeto/relacional": {
        this.clave = "1-CT-AW-03";
        break;
      }
      default: {
        break;
      }
    }
  }
}
