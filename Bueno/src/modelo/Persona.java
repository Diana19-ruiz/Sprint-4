package modelo;

public class Persona {
  protected String nombre;
  protected String apellidoP;
  protected String apellidoM;
  protected String correoPersonal;
  protected String numCasa;
  protected String numCelular;
  
  /**Constructor de la clase Persona.*/
  public Persona(String nombre, String apellidoP, String apellidoM,
         String correoPersonal, String numCasa, String numCelular) {
    this.nombre = nombre;
    this.apellidoP = apellidoP;
    this.apellidoM = apellidoM;
    this.correoPersonal = correoPersonal;
    this.numCasa = numCasa;
    this.numCelular = numCelular;
  }
  
  public Persona() {
    
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getApellidoP() {
    return apellidoP;
  }
  
  public void setApellidoP(String apellidoP) {
    this.apellidoP = apellidoP;
  }
  
  public String getApellidoM() {
    return apellidoM;
  }
  
  public void setApellidoM(String apellidoM) {
    this.apellidoM = apellidoM;
  }
  
  public String getCorreoPersonal() {
    return correoPersonal;
  }
  
  public void setCorreoPersonal(String correoPersonal) {
    this.correoPersonal = correoPersonal;
  }
  
  public String getNumCasa() {
    return numCasa;
  }
  
  public void setNumCasa(String numCasa) {
    this.numCasa = numCasa;
  }
  
  public String getNumCelular() {
    return numCelular;
  }
  
  public void setNumCelular(String numCelular) {
    this.numCelular = numCelular;
  }
  
}
