package control;

import static control.Registro.textNombre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import basedatos.EstudianteIMPA;
import modelo.Estudiante;
import modelo.Historiales;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Historial extends JFrame {

    EstudianteIMPA invocar = new EstudianteIMPA();
    ArrayList<Historiales> lista = new ArrayList<>();
	private String semestre;
    private String matricula;
	private String cve_materia;
	private String status;

	private JPanel contentPane;
    public static JTextField reciboNombre;
    public static JTextField reciboContrasena;
    public static JTextField IP;
    public static JTextField IS;
    public static JTextField ESDD;
    public static JTextField POO;
    public static JTextField ANR;
    public static JTextField TEOP;
    public static JTextField BDD;
    public static JTextField ANAL;
    public static JTextField EVO;
    public static JTextField BDD1;
    public static JTextField BDD2;
    public static JTextField BDD3;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Historial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		reciboNombre = new JTextField(""+Registro.textNombre.getText());
		reciboNombre.setEditable(false);
		reciboNombre.setBounds(98, 11, 200, 20);
		contentPane.add(reciboNombre);
		reciboNombre.setColumns(10);
		
		reciboContrasena = new JTextField(""+Registro.textMatricula.getText());
		reciboContrasena.setEditable(false);
		reciboContrasena.setBounds(98, 53, 200, 20);
		contentPane.add(reciboContrasena);
		reciboContrasena.setColumns(10);
		
		IP = new JTextField();
		IP.setText("Introduccion a la Programacion");
		IP.setBounds(10, 164, 178, 20);
		contentPane.add(IP);
	    IP.setBackground(Color.red);
		IP.setColumns(10);
		
		JList list = new JList();
		list.setBounds(226, 150, 43, -44);
		contentPane.add(list);
		
		JComboBox SemestreIP = new JComboBox();
		SemestreIP.setModel(new DefaultComboBoxModel(new String[] {"Semestre", "2018-I", "2018-II", "2019-I"}));
		SemestreIP.setBounds(477, 163, 89, 22);
		contentPane.add(SemestreIP);
		SemestreIP.setVisible(false);
		
	    JComboBox Colores = new JComboBox();
		Colores.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores.getSelectedIndex();
		        if( indice == 1){
		        	IP.setBackground(Color.green);
		        	SemestreIP.setVisible(true);
		        }else{
		            if(indice == 2){
		            	IP.setBackground(Color.yellow);
		            	SemestreIP.setVisible(false);
		            }else {
		            	if(indice == 3) {
		            		IP.setBackground(Color.red);
		            		SemestreIP.setVisible(false);
		            	}
		            }
		        }		        
			}
		});
		Colores.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores.setBounds(215, 164, 150, 20);
		contentPane.add(Colores);
		
		JLabel lblAlumno = new JLabel("ALUMNO");
		lblAlumno.setBounds(10, 14, 57, 14);
		contentPane.add(lblAlumno);
		
		JLabel lblMatricula = new JLabel("MATRICULA");
		lblMatricula.setBounds(10, 56, 77, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblMarcaConVerde = new JLabel("Marca con Verde las materias que has certificado");
		lblMarcaConVerde.setBounds(10, 81, 299, 14);
		contentPane.add(lblMarcaConVerde);
		
		JLabel lblMarcaConAmarillo = new JLabel("Marca con Amarillo las materias que estas cursando");
		lblMarcaConAmarillo.setBounds(10, 106, 310, 14);
		contentPane.add(lblMarcaConAmarillo);
		
		IS = new JTextField();
		IS.setText("Ingenieria de Software");
		IS.setColumns(10);
		IS.setBounds(10, 201, 178, 20);
		IS.setBackground(Color.red);
		contentPane.add(IS);
		
		JComboBox SemestreIS = new JComboBox();
		SemestreIS.setModel(new DefaultComboBoxModel(new String[] {"Semestre", "2018-I", "2018-II", "2019-I"}));
		SemestreIS.setBounds(477, 200, 89, 22);
		contentPane.add(SemestreIS);
		SemestreIS.setVisible(false);
		
		final JComboBox Colores2 = new JComboBox();
		Colores2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores2.getSelectedIndex();
		        if( indice == 1){
		        	IS.setBackground(Color.green);
		        	SemestreIS.setVisible(true);
		        }else{
		            if(indice == 2){
		                IS.setBackground(Color.yellow);
		                SemestreIS.setVisible(false);
		            }else {
		            	if(indice == 3) {
		            		IS.setBackground(Color.red);
		            		SemestreIS.setVisible(false);
		            	}
		            }
		        }
			}
		});
		Colores2.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores2.setBounds(215, 201, 150, 20);
		contentPane.add(Colores2);
		
		JComboBox SemestrePOO = new JComboBox();
		SemestrePOO.setModel(new DefaultComboBoxModel(new String[] {"Semestre", "2018-I", "2018-II", "2019-I"}));
		SemestrePOO.setBounds(477, 231, 89, 22);
		contentPane.add(SemestrePOO);
		SemestrePOO.setVisible(false);
		
		final JComboBox Colores3 = new JComboBox();
		Colores3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores3.getSelectedIndex();
		        if( indice == 1){
		        	POO.setBackground(Color.green);
		        	SemestrePOO.setVisible(true);
		        }else{
		            if(indice == 2){
		                POO.setBackground(Color.yellow);
		                SemestrePOO.setVisible(false);
		            }else {
		            	if(indice == 3) {
		            		POO.setBackground(Color.red);
		            		SemestrePOO.setVisible(false);
		            	}
		            }
		        }
			}
		});
		Colores3.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores3.setBounds(215, 232, 150, 20);
		contentPane.add(Colores3);
		
		POO = new JTextField();
		POO.setText("Orientada a Objetos");
		POO.setBounds(10, 232, 178, 20);
		contentPane.add(POO);
		POO.setBackground(Color.red);
		POO.setColumns(10);
		
		JComboBox SemestreEDD = new JComboBox();
		SemestreEDD.setModel(new DefaultComboBoxModel(new String[] {"Semestre", "2018-I", "2018-II", "2019-I"}));
		SemestreEDD.setBounds(477, 263, 89, 22);
		contentPane.add(SemestreEDD);
		SemestreEDD.setVisible(false);
		
		ESDD = new JTextField();
		ESDD.setBounds(10, 263, 178, 20);
		ESDD.setText("Estructura de Datos");
		contentPane.add(ESDD);
		ESDD.setBackground(Color.red);
		ESDD.setColumns(10);
		
		
		final JComboBox Colores4 = new JComboBox();
		Colores4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores4.getSelectedIndex();
		        if( indice == 1){
		        	ESDD.setBackground(Color.green);
		        	SemestreEDD.setVisible(true);
		        }else{
		            if(indice == 2){
		                ESDD.setBackground(Color.yellow);
		                SemestreEDD.setVisible(false);
		            }else {
		            	if(indice == 3) {
		            		ESDD.setBackground(Color.red);
		            		SemestreEDD.setVisible(false);
		            	}
		            }
		        }
			}
		});
		Colores4.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores4.setBounds(215, 263, 150, 20);
		contentPane.add(Colores4);
		
		JButton button = new JButton("Continuar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(SemestreIP.getSelectedIndex() == 1 || SemestreIP.getSelectedIndex() == 2 || SemestreIP.getSelectedIndex() == 3) {
					
						String semestre = (String)SemestreIP.getSelectedItem();
					matricula = Registro.textMatricula.getText();
	            	cve_materia="1-CT-IF-01";
	            	status="certificado";
	            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
	            	invocar.insertarHistorial(historial);
					
					}else {
						if(Colores.getSelectedIndex() == 2) {
							semestre="2019-II";
			            	matricula = Registro.textMatricula.getText();
			            	cve_materia="1-CT-IF-01";
			            	status="cursando";
			            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
			            	invocar.insertarHistorial(historial);
						}
					}
					
					if( SemestreIS.getSelectedIndex()== 1 || SemestreIS.getSelectedIndex() == 2 || SemestreIS.getSelectedIndex() == 3) {	
					String semestre = (String)SemestreIP.getSelectedItem();
					matricula = Registro.textMatricula.getText();
	            	cve_materia="1-CT-IS-02";
	            	status="certificado";
	            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
	            	invocar.insertarHistorial(historial);
					
					}else {
						if(Colores2.getSelectedIndex() == 2) {
							semestre="2019-II";
			            	matricula = Registro.textMatricula.getText();
			            	cve_materia="1-CT-IS-02";
			            	status="cursando";
			            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
			            	invocar.insertarHistorial(historial);
						}
					}
					
					if( SemestrePOO.getSelectedIndex()== 1 || SemestrePOO.getSelectedIndex() == 2 || SemestrePOO.getSelectedIndex() == 3) {	
						String semestre = (String)SemestrePOO.getSelectedItem();
						matricula = Registro.textMatricula.getText();
		            	cve_materia="1-CT-IF-02";
		            	status="certificado";
		            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
		            	invocar.insertarHistorial(historial);
						
						}else {
							if(Colores3.getSelectedIndex() == 2) {
								semestre="2019-II";
				            	matricula = Registro.textMatricula.getText();
				            	cve_materia="1-CT-IF-02";
				            	status="cursando";
				            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
				            	invocar.insertarHistorial(historial);
							}
						}
					
					if( SemestreEDD.getSelectedIndex()== 1 || SemestreEDD.getSelectedIndex() == 2 || SemestreEDD.getSelectedIndex() == 3) {	
						String semestre = (String)SemestreEDD.getSelectedItem();
						matricula = Registro.textMatricula.getText();
		            	cve_materia="1-CT-IS-03";
		            	status="certificado";
		            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
		            	invocar.insertarHistorial(historial);
						
						}else {
							if(Colores4.getSelectedIndex() == 2) {
								semestre="2019-II";
				            	matricula = Registro.textMatricula.getText();
				            	cve_materia="1-CT-IS-03";
				            	status="cursando";
				            	Historiales historial = new Historiales(semestre,matricula,cve_materia,status);
				            	invocar.insertarHistorial(historial);
							}
						}
					setVisible(false);
					MostrarHistorial frame;
					frame = new MostrarHistorial();
					frame.setVisible(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Algo salio mal");
				}
			}
		});
		button.setBounds(10, 610, 139, 23);
		contentPane.add(button);
		
		JLabel lblMateriasQueNo = new JLabel("Materias que NO has cursado o NO has pasado dejalas en ROJO");
		lblMateriasQueNo.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblMateriasQueNo.setBounds(10, 131, 424, 22);
		contentPane.add(lblMateriasQueNo);
		
		
		JLabel lblCilcoSuperior = new JLabel("Cilco Superior");
		lblCilcoSuperior.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblCilcoSuperior.setBounds(10, 294, 139, 20);
		contentPane.add(lblCilcoSuperior);
		
		ANR = new JTextField();
		ANR.setText("Analisis de Requisitos");
		ANR.setBounds(10, 322, 178, 20);
		contentPane.add(ANR);
		ANR.setBackground(Color.red);
		ANR.setColumns(10);
		
		TEOP = new JTextField();
		TEOP.setText("Teoria de la Computacion");
		TEOP.setColumns(10);
		TEOP.setBounds(10, 353, 178, 20);
		TEOP.setBackground(Color.red);
		contentPane.add(TEOP);
		
		BDD = new JTextField();
		BDD.setText("Base de Datos");
		BDD.setColumns(10);
		BDD.setBounds(10, 385, 178, 20);
		BDD.setBackground(Color.red);
		contentPane.add(BDD);
		
		ANAL = new JTextField();
		ANAL.setText("Analisis de Algoritmos");
		ANAL.setColumns(10);
		ANAL.setBounds(10, 416, 178, 20);
		ANAL.setBackground(Color.red);
		contentPane.add(ANAL);
		
		EVO = new JTextField();
		EVO.setText("Construccion y EVO");
		EVO.setColumns(10);
		EVO.setBounds(10, 447, 178, 20);
		EVO.setBackground(Color.red);
		contentPane.add(EVO);
		
		final JComboBox Colores5 = new JComboBox();
		Colores5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores5.getSelectedIndex();
		        if( indice == 1){
		        	ANR.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                ANR.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		ANR.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores5.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores5.setBounds(215, 322, 150, 20);
		contentPane.add(Colores5);
		
		final JComboBox Colores6 = new JComboBox();
		Colores6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores6.getSelectedIndex();
		        if( indice == 1){
		        	TEOP.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                TEOP.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		TEOP.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores6.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores6.setBounds(215, 353, 150, 20);
		contentPane.add(Colores6);
		
		final JComboBox Colores7 = new JComboBox();
		Colores7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores7.getSelectedIndex();
		        if( indice == 1){
		        	BDD.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                BDD.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		BDD.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores7.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores7.setBounds(215, 385, 150, 20);
		contentPane.add(Colores7);
		
		final JComboBox Colores8 = new JComboBox();
		Colores8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores8.getSelectedIndex();
		        if( indice == 1){
		        	ANAL.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                ANAL.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		ANAL.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores8.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores8.setBounds(215, 416, 150, 20);
		contentPane.add(Colores8);
		
		final JComboBox Colores9 = new JComboBox();
		Colores9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores9.getSelectedIndex();
		        if( indice == 1){
		        	EVO.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                EVO.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		EVO.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores9.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores9.setBounds(215, 447, 150, 20);
		contentPane.add(Colores9);
		
		JLabel lblOptativas = new JLabel("Optativas");
		lblOptativas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblOptativas.setBounds(10, 489, 139, 20);
		contentPane.add(lblOptativas);
		
		BDD1 = new JTextField();
	    BDD1.setText("Bases de Datos 1");
		BDD1.setBounds(13, 520, 175, 20);
		contentPane.add(BDD1);
		BDD1.setBackground(Color.red);
		BDD1.setColumns(10);
		
		BDD2 = new JTextField();
		BDD2.setText("Bases de Dtaos 2");
		BDD2.setColumns(10);
		BDD2.setBounds(13, 551, 175, 20);
		BDD2.setBackground(Color.red);
		contentPane.add(BDD2);
		
		BDD3 = new JTextField();
		BDD3.setText("Administracion de Datos");
		BDD3.setColumns(10);
		BDD3.setBounds(13, 582, 175, 20);
		BDD3.setBackground(Color.red);
		contentPane.add(BDD3);
		
		final JComboBox Colores10 = new JComboBox();
		Colores10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores10.getSelectedIndex();
		        if( indice == 1){
		        	BDD1.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                BDD1.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		BDD1.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores10.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores10.setBounds(215, 520, 150, 20);
		contentPane.add(Colores10);
		
		final JComboBox Colores11 = new JComboBox();
		Colores11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores11.getSelectedIndex();
		        if( indice == 1){
		        	BDD2.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                BDD2.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		BDD2.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores11.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores11.setBounds(215, 551, 150, 20);
		contentPane.add(Colores11);
		
		final JComboBox Colores12 = new JComboBox();
		Colores12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int indice = Colores12.getSelectedIndex();
		        if( indice == 1){
		        	BDD3.setBackground(Color.green);
		        }else{
		            if(indice == 2){
		                BDD3.setBackground(Color.yellow);
		            }else {
		            	if(indice == 3) {
		            		BDD3.setBackground(Color.red);
		            	}
		            }
		        }
			}
		});
		Colores12.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Certificado", "Cursando", "No Certificado"}));
		Colores12.setBounds(215, 582, 150, 20);
		contentPane.add(Colores12);
	}
}

