package basedatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import control.Historial;
import control.Registro;
import modelo.Cuenta;
import modelo.Estudiante;
import modelo.Historiales;
import modelo.UsuarioEstudiante;
import modelo.UsuarioHallado;

import java.sql.Connection;

public class EstudianteIMPA implements EstudianteIMP{
	private AdminBD admin;
	private Connection conexion;
	private boolean conexionTransferida;
	
	public EstudianteIMPA() {
		admin = new AdminBD();		
		conexion=null;
	}
	
	public EstudianteIMPA(Connection conexion) {
		this.conexion=conexion;
		conexionTransferida=true;
	}
	
	public int insertar(Estudiante estudiante) {
		int verificar=0;
		PreparedStatement ps=null;

		String sql="INSERT INTO estudiantes(matricula,nombre,apellidop,correo_institucional,apellidom,correo_personal,numero_casa,numero_celular,password) VALUES(?,?,?,?,?,?,?,?,?);";
		if(conexionTransferida==false)
			conexion=admin.dameConexion();
		
		try {
			ps=conexion.prepareStatement(sql);

			ps.setString(1, estudiante.getMatricula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellidoP());
			ps.setString(4, estudiante.getCorreoInstitucional());
			ps.setString(5, estudiante.getApellidoM());
			ps.setString(6, estudiante.getCorreoPersonal());
			ps.setString(7, estudiante.getNumCasa());
			ps.setString(8, estudiante.getNumCelular());
			ps.setString(9, estudiante.getPassword());
			
			try{
				verificar=ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los datos ya estan registrados");
			
			}finally {
				ps.close();
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				if(conexionTransferida==false)
					conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return verificar;
	}

	public int insertarHistorial(Historiales historial) {
		int verificar=0;
		PreparedStatement ps=null;

		String sql="INSERT INTO historiales(tipo_semestre,matricula,cve_materia,status) VALUES(?,?,?,?);";
		if(conexionTransferida==false)
			conexion=admin.dameConexion();
		
		try {
			ps=conexion.prepareStatement(sql);

			ps.setString(1, historial.getSemestre());
			ps.setString(2, historial.getMatricula());
			ps.setString(3, historial.getCve_materia());
			ps.setString(4, historial.getStatus());
	
			try{
				verificar=ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Llave duplicada o error en el query");
			
			}finally {
				ps.close();
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				if(conexionTransferida==false)
					conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return verificar;
	}

	public UsuarioHallado consultar(UsuarioEstudiante usuario) {
		UsuarioHallado hallado=null;
		PreparedStatement ps=null;
		String sql=null;
		ResultSet tabla=null;
		String correoI, matricula, password;
				
		conexion= admin.dameConexion();		
		sql="SELECT correo_institucional, matricula, password FROM usuarioestudiante"+
		       " WHERE  correo_institucional=? AND password=?;";
		try {
			ps= conexion.prepareStatement(sql);
			ps.setString(1, usuario.getCorreo_institucional());
			ps.setString(2, usuario.getPassword());
			tabla=ps.executeQuery();
			if(tabla.next()) {
				correoI=tabla.getString("correo_institucional");
			    matricula=tabla.getString("matricula");
			    password=tabla.getString("password");
				return hallado= new UsuarioHallado(correoI,matricula, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hallado;
	}

	@Override
	public int insertarUsuario(UsuarioEstudiante usuario) {
		int verificar=0;
		PreparedStatement ps=null;

		String sql="INSERT INTO usuarioestudiante(correo_institucional,matricula,password) VALUES(?,?,?);";
		if(conexionTransferida==false)
			conexion=admin.dameConexion();
		
		try {
			ps=conexion.prepareStatement(sql);

			ps.setString(1, usuario.getCorreo_institucional());
			ps.setString(2, usuario.getMatricula());
			ps.setString(3, usuario.getPassword());
			
			try{
				verificar=ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Los datos ya estan registrados");
			
			}finally {
				ps.close();
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				if(conexionTransferida==false)
					conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return verificar;
	}
}
