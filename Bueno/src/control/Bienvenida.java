package control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import basedatos.EstudianteIMPA;
import modelo.UsuarioEstudiante;
import modelo.UsuarioHallado;
import modelo.Validacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Bienvenida extends JFrame {

  private JPanel contentPane;
  private Validacion validacion = new Validacion();
  private JTextField txtCorreoInstitucional;
  private JTextField txtPassword;
  private String usuario,contrasena,matricula;
  private JTextField textMatricula;
  EstudianteIMPA invocar = new EstudianteIMPA();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Bienvenida frame = new Bienvenida();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Bienvenida() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblbienvenido = new JLabel("\u00A1\u00A1\u00A1Bienvenido!!!");
    lblbienvenido.setHorizontalAlignment(SwingConstants.CENTER);
    lblbienvenido.setBounds(153, 11, 125, 14);
    contentPane.add(lblbienvenido);
    
    txtCorreoInstitucional = new JTextField();
    txtCorreoInstitucional.setHorizontalAlignment(SwingConstants.CENTER);
    txtCorreoInstitucional.setText("Correo institucional\r\n");
    txtCorreoInstitucional.setBounds(153, 44, 125, 20);
    contentPane.add(txtCorreoInstitucional);
    txtCorreoInstitucional.setColumns(10);
    usuario = (String)txtCorreoInstitucional.getText();
    
    txtPassword = new JTextField();
    txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
    txtPassword.setText("Contrase\u00F1a");
    txtPassword.setToolTipText("");
    txtPassword.setBounds(153, 137, 125, 20);
    contentPane.add(txtPassword);
    txtPassword.setColumns(10);
    contrasena = (String)txtPassword.getText();
    
    textMatricula = new JTextField();
    textMatricula.setBounds(152, 93, 126, 20);
    contentPane.add(textMatricula);
    textMatricula.setColumns(10);
    matricula = (String)textMatricula.getText();
    
    JButton btnIniciar = new JButton("Iniciar Sesi\u00F3n");
    btnIniciar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
    	  UsuarioEstudiante usuarioa = new UsuarioEstudiante(usuario,matricula,contrasena);
    	  UsuarioHallado hallado=null;
    	  hallado = invocar.consultar(usuarioa);
    	  if( hallado.getCorreo_institucional().equals(usuario)) {
    		  Encuesta visible = new Encuesta();
    		  visible.setVisible(true);
    	  }else {
    		  JOptionPane.showMessageDialog(null, "No esta dado de alta");
    	  }
      }
    });
    btnIniciar.setBounds(153, 168, 125, 23);
    contentPane.add(btnIniciar);
    
    JButton btnRegistrarse = new JButton("Registrarse");
    btnRegistrarse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        Registro registro = new Registro();
        registro.setVisible(true);
      }
    });
    btnRegistrarse.setBounds(204, 227, 104, 23);
    contentPane.add(btnRegistrarse);
    
    JButton btnEncuesta = new JButton("Encuesta");
    btnEncuesta.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        Encuesta encuesta = new Encuesta();
        encuesta.setVisible(true);
      }
    });
    btnEncuesta.setBounds(318, 227, 89, 23);
    contentPane.add(btnEncuesta);
  }
}
