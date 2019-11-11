package control;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Archivo;
import modelo.Horario;
import modelo.Inscripcion;
import modelo.Materia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import basedatos.InscripcionImp;

public class Encuesta extends JFrame {

  private JPanel contentPane;
  private Inscripcion inscripcion;
  private DefaultTableModel modelo;
  private JTable tblDatos;



  /**
  * Create the frame.
  */
  public Encuesta() {
    inscripcion = new Inscripcion();
    setTitle("Encuesta");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 557, 393);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblBienvenida = new JLabel("Bienvenido a la encuesta para"
           + " la planificaci\u00F3n de horarios");
    lblBienvenida.setBounds(10, 11, 336, 14);
    contentPane.add(lblBienvenida);

    JLabel lbltexto = new JLabel("Elige alguna de las opciones");
    lbltexto.setBounds(10, 61, 162, 14);
    contentPane.add(lbltexto);

    JLabel lblSemestre = new JLabel("Semestre o Optativa"); 
    lblSemestre.setBounds(10, 86, 124, 14);
    contentPane.add(lblSemestre);

    JLabel lblMateria = new JLabel("Materia");
    lblMateria.setBounds(149, 86, 48, 14);
    contentPane.add(lblMateria);

    JComboBox cmbMateria = new JComboBox();
    cmbMateria.setModel(new DefaultComboBoxModel(new String[] {"An\u00E1lisis de algoritmos", "Teor\u00EDa de la computaci\u00F3n", "Construcci\u00F3n y evoluci\u00F3n del software", "Bases de datos", "An\u00E1lisis de requisitos"}));
    cmbMateria.setBounds(149, 111, 145, 22);
    contentPane.add(cmbMateria);

    JComboBox cmbSemestre = new JComboBox();
    cmbSemestre.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String item = (String) cmbSemestre.getSelectedItem();
        cmbMateria.removeAllItems();
        switch (item) {
          case "5to semestre": {
            cmbMateria.addItem("Análisis de algoritmos");
            cmbMateria.addItem("Teoría de la computación");
            cmbMateria.addItem("Construcción y evolución del software");
            cmbMateria.addItem("Bases de datos");
            cmbMateria.addItem("Análisis de requisitos");
            break;
          }
          case "6to semestre": {
            cmbMateria.addItem("Programación web");
            cmbMateria.addItem("Sistemas operativos");
            cmbMateria.addItem("Aseguramiento de la calidad del software");
            cmbMateria.addItem("Análisis y modelamiento de software");
            cmbMateria.addItem("Programación de sistemas");
            break;
          }
          case "7mo semestre": {
            cmbMateria.addItem("Arquitectura de computadoras");
            cmbMateria.addItem("Lenguajes de programación");
            cmbMateria.addItem("Técnicas de pruebas de software");
            cmbMateria.addItem("Diseño de software");
            cmbMateria.addItem("Metodología de la investigación");
            break;
          }
          case "8vo semestre": {
            cmbMateria.addItem("Redes de computadoras");
            cmbMateria.addItem("Normatividad y legislación");
            cmbMateria.addItem("Arquitectura de software");
            break;
          }
          case "9no semestre": {
            cmbMateria.addItem("Sistemas distribuidos");
            cmbMateria.addItem("Administración de proyectos I");
            cmbMateria.addItem("Métricas de software");
            break;
          }
          case "10mo semestre": {
            cmbMateria.addItem("Diseño de experimentos en ingeniería de software");
            cmbMateria.addItem("Administración de proyectos II");
            cmbMateria.addItem("Gestión tecnológica");
            break;
          }
          case "Aplicaciones web": {
            cmbMateria.addItem("XML 1");
            cmbMateria.addItem("XML 2");
            cmbMateria.addItem("Mapeo objeto/relacional");
            break;
          }
          case "Inteligencia artificial": {
            cmbMateria.addItem("Inteligencia artificial");
            cmbMateria.addItem("Seminario de inteligencia artificial I");
            cmbMateria.addItem("Seminario de inteligencia artificial II");
            break;
          }
          case "Sistemas móviles y embebidos": {
            cmbMateria.addItem("Computación móvil");
            cmbMateria.addItem("Sistemas embebidos");
            cmbMateria.addItem("Sistemas en tiempo real");
            break;
          }
          case "Tecnologías de bases de datos": {
            cmbMateria.addItem("Especialidad en bases de datos I");
            cmbMateria.addItem("Especialidad en bases de datos II");
            cmbMateria.addItem("Administración de bases de datos");
            cmbMateria.addItem("Inteligencia de negocios");
            break;
          }
          default: {
    
          }
        }
      }
    });
    cmbSemestre.setModel(new DefaultComboBoxModel(new String[] {"5to semestre", "6to semestre", "7mo semestre", "8vo semestre", "9no semestre", "10mo semestre","Aplicaciones web", "Inteligencia artificial", "Sistemas móviles y embebidos", "Tecnologías de bases de datos"}));
    cmbSemestre.setBounds(10, 111, 105, 22);
    contentPane.add(cmbSemestre);
    
    JComboBox cmbTurno = new JComboBox();
    cmbTurno.setModel(new DefaultComboBoxModel(new String[] {"Matutino", "Vespertino"}));
    cmbTurno.setBounds(351, 111, 94, 22);
    contentPane.add(cmbTurno);
    

    JLabel lblNotaRecuerdaQue = new JLabel("Nota: Recueda que ... \r\n");
    lblNotaRecuerdaQue.setBounds(10, 25, 124, 14);
    contentPane.add(lblNotaRecuerdaQue);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(10, 144, 521, 129);
    contentPane.add(scrollPane);

    tblDatos = new JTable();
    tblDatos.setModel(new DefaultTableModel(
        new Object[][] {
        },
        new String[] {
          "Clave","Semestre o Optativa", "Materias","Turno"
        }
    ));
    scrollPane.setViewportView(tblDatos);

    JButton btnAgregar = new JButton("Agregar");
    btnAgregar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        //Obtenemos los datos del combo box
        String semestre = (String) cmbSemestre.getSelectedItem();
        String nomMateria = (String) cmbMateria.getSelectedItem();
        String turno = (String) cmbTurno.getSelectedItem();
        
        //Creamos el horario
        Horario horario = inscripcion.crearHorario(nomMateria, semestre, turno);
        if (inscripcion.equals(horario)) {
          JOptionPane.showMessageDialog(null, "La materia ya se agregó :(");
        } else {
          if (inscripcion.getTam() <= 6) {
            //Agregamos el horario
            inscripcion.agregarHorario(horario);
            //Creamos el modelo de la tabla
            modelo = (DefaultTableModel) tblDatos.getModel();
            //Creamos la fila
            String [] fila = new String[4];
            fila[0] = horario.getMateria().getClave();
            fila[1] = semestre;
            fila[2] = nomMateria;
            fila[3] = turno;
            //Agregamos la fila al modelo
            modelo.addRow(fila);
            //Insertamos el modelo
            tblDatos.setModel(modelo);
          } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más materias :/");
          }
        }
        
      
      }
    });
    btnAgregar.setBounds(10, 297, 89, 23);
    contentPane.add(btnAgregar);

    JButton btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
          //almacenamos la fila seleccionada
          int fila = tblDatos.getSelectedRow();
          if (fila >= 0 && fila < inscripcion.getTam()) {
            modelo = (DefaultTableModel) tblDatos.getModel();
            //Eliminamos el horario
            inscripcion.eliminarHorario(fila);
            //Eliminamos la fila
            modelo.removeRow(fila);
            tblDatos.setModel(modelo);
        } else {
              JOptionPane.showMessageDialog(null, "Seleccione una fila :)");
          }
      }
    });
    btnEliminar.setBounds(109, 297, 89, 23);
    contentPane.add(btnEliminar);

    JButton btnEnviar = new JButton("Enviar");
    btnEnviar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String cad = "Se muestran los cursos enviados... \n";
        cad += inscripcion.toString();
        JOptionPane.showMessageDialog(null, cad);
          //Eliminar las filas de la tabla
          DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
            int fila = modelo.getRowCount();
            for (int i = fila - 1; i >= 0; i--) {
          modelo.removeRow(i);
            }
            tblDatos.setModel(modelo);
            if (inscripcion.getTam() > 0) {
              //Insertamos los datos en la base de datos
              InscripcionImp inscripcionImp = new InscripcionImp();
              for (int i = 0; i < inscripcion.getTam(); i++) {
                inscripcionImp.insertar(inscripcion, "16-003-0199", i);
              }
              inscripcion.eliminarHorarios();
            }
            
            
            //Insertamos los datos en la base de datos
            /*InscripcionImp inscripcionImp = new InscripcionImp();
            for (int i = 0; i < inscripcion.getTam(); i++) {
            inscripcionImp.insertar(inscripcion, "15-003-0022", i);
            }
            inscripcion.eliminarHorarios();*/
      }
    });
    btnEnviar.setBounds(379, 297, 89, 23);
    contentPane.add(btnEnviar);

    JLabel lblMensaje = new JLabel("las materias de ciclo b\u00E1sico "
           + "se abren todos los semestres");
    lblMensaje.setBounds(10, 36, 353, 14);
    contentPane.add(lblMensaje);
    
    JLabel lblTurno = new JLabel("Turno");
    lblTurno.setBounds(351, 86, 48, 14);
    contentPane.add(lblTurno);
    
    
    
  }
}
