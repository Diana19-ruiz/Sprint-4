package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Estudiante;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import java.io.PrintWriter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class MostrarHistorial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Estudiante estudiante = new Estudiante();
	private JTextField IP;
	private JTextField IS;
	private JLabel lblHistorialDeMaterias;
	private JLabel lblAlumno;
	private JLabel lblMatricula;
	private JTextField alumno;
	private JTextField matricula;
	private JTextField POO;
	private JTextField ESDD;
	private JLabel lblCicloBasico;
	private JLabel lblCicloSuperior;
	private JTextField ANR;
	private JTextField TEOP;
	private JTextField BDD;
	private JTextField ANAL;
	private JTextField EVO;
	private JLabel lblOptativas;
	private JTextField BDD1;
	private JTextField BDD2;
	private JTextField BDD3;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MostrarHistorial() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IP = new JTextField(""+Historial.IP.getText());
		IP.setBounds(10, 126, 252, 20);
		contentPane.add(IP);
		if(Historial.IP.getBackground().equals(Color.red)){
			IP.setBackground(Color.red);
		}else{
			if(Historial.IP.getBackground().equals(Color.green)){
				IP.setBackground(Color.green);
			}else{
				if(Historial.IP.getBackground().equals(Color.yellow)){
					IP.setBackground(Color.yellow);
				}
			}
		}
		IP.setColumns(10);
		
		IS = new JTextField(""+Historial.IS.getText());
		IS.setBounds(10, 157, 252, 20);
		contentPane.add(IS);
		if(Historial.IS.getBackground().equals(Color.red)){
			IS.setBackground(Color.red);
		}else{
			if(Historial.IS.getBackground().equals(Color.green)){
				IS.setBackground(Color.green);
			}else{
				if(Historial.IS.getBackground().equals(Color.yellow)){
					IS.setBackground(Color.yellow);
				}
			}
		}
		IS.setColumns(10);
		
		lblHistorialDeMaterias = new JLabel("Historial de Materias");
		lblHistorialDeMaterias.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblHistorialDeMaterias.setBounds(10, 11, 231, 20);
		contentPane.add(lblHistorialDeMaterias);
		
		lblAlumno = new JLabel("Alumno");
		lblAlumno.setBounds(10, 42, 46, 14);
		contentPane.add(lblAlumno);
		
		lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 67, 74, 14);
		contentPane.add(lblMatricula);
		
		alumno = new JTextField(""+Historial.reciboNombre.getText());
		alumno.setEditable(false);
		alumno.setBounds(94, 42, 241, 20);
		contentPane.add(alumno);
		alumno.setColumns(10);
		
		matricula = new JTextField(""+Historial.reciboContrasena.getText());
		matricula.setEditable(false);
		matricula.setBounds(94, 67, 241, 20);
		contentPane.add(matricula);
		matricula.setColumns(10);
		
		POO = new JTextField(""+Historial.POO.getText());
		if(Historial.POO.getBackground().equals(Color.red)){
			POO.setBackground(Color.red);
		}else{
			if(Historial.POO.getBackground().equals(Color.green)){
				POO.setBackground(Color.green);
			}else{
				if(Historial.POO.getBackground().equals(Color.yellow)){
					POO.setBackground(Color.yellow);
				}
			}
		}
		POO.setColumns(10);
		POO.setBounds(10, 188, 252, 20);
		contentPane.add(POO);
		
		ESDD = new JTextField(""+Historial.ESDD.getText());
		if(Historial.ESDD.getBackground().equals(Color.red)){
			ESDD.setBackground(Color.red);
		}else{
			if(Historial.ESDD.getBackground().equals(Color.green)){
				ESDD.setBackground(Color.green);
			}else{
				if(Historial.ESDD.getBackground().equals(Color.yellow)){
					ESDD.setBackground(Color.yellow);
				}
			}
		}
		ESDD.setColumns(10);
		ESDD.setBounds(10, 219, 252, 20);
		contentPane.add(ESDD);
		
		lblCicloBasico = new JLabel("Ciclo Basico");
		lblCicloBasico.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblCicloBasico.setBounds(10, 95, 111, 20);
		contentPane.add(lblCicloBasico);
		
		lblCicloSuperior = new JLabel("Ciclo Superior");
		lblCicloSuperior.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblCicloSuperior.setBounds(10, 255, 111, 20);
		contentPane.add(lblCicloSuperior);
		
		ANR = new JTextField(""+Historial.ANR.getText());
		if(Historial.ANR.getBackground().equals(Color.red)){
			ANR.setBackground(Color.red);
		}else{
			if(Historial.ANR.getBackground().equals(Color.green)){
				ANR.setBackground(Color.green);
			}else{
				if(Historial.ANR.getBackground().equals(Color.yellow)){
					ANR.setBackground(Color.yellow);
				}
			}
		}
		ANR.setColumns(10);
		ANR.setBounds(10, 286, 252, 20);
		contentPane.add(ANR);
		
		TEOP = new JTextField(""+Historial.TEOP.getText());
		if(Historial.TEOP.getBackground().equals(Color.red)){
			TEOP.setBackground(Color.red);
		}else{
			if(Historial.TEOP.getBackground().equals(Color.green)){
				TEOP.setBackground(Color.green);
			}else{
				if(Historial.TEOP.getBackground().equals(Color.yellow)){
					TEOP.setBackground(Color.yellow);
				}
			}
		}
		TEOP.setColumns(10);
		TEOP.setBounds(10, 320, 252, 20);
		contentPane.add(TEOP);
		
		BDD = new JTextField(""+Historial.BDD.getText());
		if(Historial.BDD.getBackground().equals(Color.red)){
			BDD.setBackground(Color.red);
		}else{
			if(Historial.BDD.getBackground().equals(Color.green)){
				BDD.setBackground(Color.green);
			}else{
				if(Historial.BDD.getBackground().equals(Color.yellow)){
					BDD.setBackground(Color.yellow);
				}
			}
		}
		BDD.setColumns(10);
		BDD.setBounds(10, 358, 252, 20);
		contentPane.add(BDD);
		
		ANAL = new JTextField(""+Historial.ANAL.getText());
		if(Historial.ANAL.getBackground().equals(Color.red)){
			ANAL.setBackground(Color.red);
		}else{
			if(Historial.ANAL.getBackground().equals(Color.green)){
				ANAL.setBackground(Color.green);
			}else{
				if(Historial.ANAL.getBackground().equals(Color.yellow)){
					ANAL.setBackground(Color.yellow);
				}
			}
		}
		ANAL.setColumns(10);
		ANAL.setBounds(10, 389, 252, 20);
		contentPane.add(ANAL);
		
		EVO = new JTextField(""+Historial.EVO.getText());
		if(Historial.EVO.getBackground().equals(Color.red)){
			EVO.setBackground(Color.red);
		}else{
			if(Historial.EVO.getBackground().equals(Color.green)){
				EVO.setBackground(Color.green);
			}else{
				if(Historial.EVO.getBackground().equals(Color.yellow)){
					EVO.setBackground(Color.yellow);
				}
			}
		}
		EVO.setColumns(10);
		EVO.setBounds(10, 420, 252, 20);
		contentPane.add(EVO);
		
		lblOptativas = new JLabel("Optativas");
		lblOptativas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblOptativas.setBounds(10, 451, 111, 20);
		contentPane.add(lblOptativas);
		
		BDD1 = new JTextField(""+Historial.BDD1.getText());
		if(Historial.BDD1.getBackground().equals(Color.red)){
			BDD1.setBackground(Color.red);
		}else{
			if(Historial.BDD1.getBackground().equals(Color.green)){
				BDD1.setBackground(Color.green);
			}else{
				if(Historial.BDD1.getBackground().equals(Color.yellow)){
					BDD1.setBackground(Color.yellow);
				}
			}
		}
		BDD1.setColumns(10);
		BDD1.setBounds(10, 482, 252, 20);
		contentPane.add(BDD1);
		
		BDD2 = new JTextField(""+Historial.BDD2.getText());
		if(Historial.BDD2.getBackground().equals(Color.red)){
			BDD2.setBackground(Color.red);
		}else{
			if(Historial.BDD2.getBackground().equals(Color.green)){
				BDD2.setBackground(Color.green);
			}else{
				if(Historial.BDD2.getBackground().equals(Color.yellow)){
					BDD2.setBackground(Color.yellow);
				}
			}
		}
		BDD2.setColumns(10);
		BDD2.setBounds(10, 513, 252, 20);
		contentPane.add(BDD2);
		
		BDD3 = new JTextField(""+Historial.BDD3.getText());
		if(Historial.BDD3.getBackground().equals(Color.red)){
			BDD3.setBackground(Color.red);
		}else{
			if(Historial.BDD3.getBackground().equals(Color.green)){
				BDD3.setBackground(Color.green);
			}else{
				if(Historial.BDD3.getBackground().equals(Color.yellow)){
					BDD3.setBackground(Color.yellow);
				}
			}
		}
		BDD3.setColumns(10);
		BDD3.setBounds(10, 544, 252, 20);
		contentPane.add(BDD3);
		
		JButton btnGuardar = new JButton("Menu Principal");
		btnGuardar.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        setVisible(false);
		        Bienvenida registro = new Bienvenida();
		        registro.setVisible(true);
		      }
		    });
		btnGuardar.setBounds(295, 578, 129, 23);
		contentPane.add(btnGuardar);
	}
}
