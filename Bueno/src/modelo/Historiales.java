package modelo;

public class Historiales {
	private String semestre;
	private String matricula;
	private String cve_materia;
	private String status;
	
	public Historiales(String semestre, String matricula, String cve_materia, String status) {
		this.semestre = semestre;
		this.matricula = matricula;
		this.cve_materia = cve_materia;
		this.status = status;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCve_materia() {
		return cve_materia;
	}

	public void setCve_materia(String cve_materia) {
		this.cve_materia = cve_materia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
