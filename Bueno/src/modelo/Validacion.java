package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
  
  public Validacion() {
	  
  }
  
  /**Valida la matr�cula.*/
  public Boolean validarMatricula(String matricula){
    //Cadena que representa la expresi�n regular
    Boolean validar;
    String expresion = "[0-9]{2}[-](00)[1-5][-][0-9]{4}";
    Pattern patron = Pattern.compile(expresion); //Representamos la expresi�n regular
    Matcher m = patron.matcher(matricula); //Comprueba que el n�mero cumpla con el patron
    //Verificamos que la matr�cula cumpla con el patr�n
    boolean verificacion = m.matches();
    validar = verificacion;
    
    return validar;
    
  }
  
  /**Valida el correo personal.*/
  public Boolean validarCorreoPersonal(String correoPersonal){
    Boolean validar = null;
	String expresion = "[_a-zA-Z0-9.]+[@]"+"(hotmail|gmail|yahoo|outlook|live)"+"(.com)?(.mx)?";
    Pattern patron = Pattern.compile(expresion);//Representamos la expresi�n regular
    Matcher m = patron.matcher(correoPersonal);// Comprueba que el correo cumpla con el patron
    validar = m.matches();//Regresa el resultado de la verificaci�n del correo
    
    return validar;
  }
  
  /**Valida el correo institucional.*/
  public Boolean validarCorreoInstitucional(String correoInstitucional) {
    Boolean verificar = null;
    String expresion = "[_a-zA-Z0-9.]+[@]"
        + "(estudiante|alumnos)"
        + "(.uacm)(.edu)(.mx)";
    Pattern patron = Pattern.compile(expresion);//Representamos la expresi�n regular
    Matcher m = patron.matcher(correoInstitucional);//Comprueba que el correo cumpla con el patron
    verificar = m.matches();// Regresa el resultado de la verificaci�n del correo
 
    return verificar;
  }
  
  /**Valida el n�mero telef�nico de casa.*/
  public Boolean validarNumCasa(String numCasa) {
    Boolean verificar = null;
    String expresion = "(55)[0-9]{8}";
    Pattern patron = Pattern.compile(expresion);//Representamos el patron
    Matcher m = patron.matcher(numCasa);//Comprobamos que el numero de casa cumpla con el patron
    verificar = m.matches();//Regresa el resultado de la verificaci�n del n�mero

    return verificar;
  }
  
  /**Valida el correo institucional.*/
  public Boolean validarNumTel(String numCelular) {
    Boolean verificar = null;
    String expresion = "(55|56)[0-9]{8}";
    Pattern patron = Pattern.compile(expresion);//Representamos la expresi�n regular
    Matcher m = patron.matcher(numCelular);//Comprobamos que el n�mero cumpla con el patron
    verificar = m.matches();//Regresa el resultado de la verificaci�n del patron
    
    return verificar;
  }
}
