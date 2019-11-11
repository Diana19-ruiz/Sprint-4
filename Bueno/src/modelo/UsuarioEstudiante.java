package modelo;

public class UsuarioEstudiante {
	private String correo_institucional;
	private String matricula;
	private String password;
	
	public UsuarioEstudiante(String correo_institucional, String matricula, String password) {
		this.correo_institucional = correo_institucional;
		this.matricula = matricula;
		this.password = password;
	}

	public String getCorreo_institucional() {
		return correo_institucional;
	}

	public void setCorreo_institucional(String correo_institucional) {
		this.correo_institucional = correo_institucional;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
