package modelo;

public class Estudiante {
  private String nombre;
  private String apellidoP;
  private String apellidoM;
  private String matricula;
  private String correoPersonal;
  private String correoInstitucional;
  private String numCasa;
  private String numCelular;
  private Cuenta cuenta;
  private String password;
  
  /**Constructor.*/
  public Estudiante(String nombre, String apellidoP,String apellidoM,String matricula, 
         String correoI,String correoP,String numCasa, String numCelular,String password) {
    this.apellidoM = apellidoM;
    this.apellidoP = apellidoP;
    this.nombre = nombre;
    this.matricula = matricula;
    this.correoPersonal = correoP;
    this.correoInstitucional = correoI;
    this.numCasa = numCasa;
    this.numCelular = numCelular;
    this.password = password;
  }
  
  public Estudiante() {
    
  }
  
  public Cuenta getCuenta() {
    return cuenta;
  }

  public void setCuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
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

  public String getMatricula() {
    return matricula;
  }
  
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCorreoPersonal() {
    return correoPersonal;
  }

  public void setCorreoPersonal(String correoPersonal) {
    this.correoPersonal = correoPersonal;
    
  }

  public String getCorreoInstitucional() {
    return correoInstitucional;
  }

  public void setCorreoInstitucional(String correoInstitucional) {
    this.correoInstitucional = correoInstitucional;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
  
  /*
  public void imprimir() {
    System.out.println("\n\n\t\tNombre -> " + this.nombre);
    System.out.println("\n\n\t\tMatrícula -> " + this.matricula);
    System.out.println("\n\n\t\tCorreo Institucional -> " + this.correoInstitucional);
    System.out.println("\n\n\t\tCorreo Personal -> " + this.correoPersonal);
    System.out.println("\n\n\t\tNúmero Celular -> " + this.numCelular);
    System.out.println("\n\n\t\tNúmero de Casa -> " + this.numCasa);
  }*/
  
}
