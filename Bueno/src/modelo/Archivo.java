package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Archivo {
  private File file;
  private FileWriter escritor;
  
  public Archivo() {
    file = null;
    escritor = null;
  }
  
  /**Escribir en un archivo de texto.*/
  public void escribirArchivo(String nombre, String texto) {
    try {
      file = new File(nombre);
      escritor = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(escritor);
      PrintWriter salida = new PrintWriter(bw);
      
      salida.write(texto + "\n");
      salida.close();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Error al escribir en el archivo :(");
    }
  }
  
  
}
