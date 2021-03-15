package Clases.ito.poo;
import java.time.LocalDate;
public class Expedientes {
	
	private String nombre = "";

	/**
	 * Description of the property rfc.
	 */
	private String rfc = "";

	/**
	 * Description of the property fechanacimiento.
	 */
	private LocalDate fechanacimiento = null;

	/**
	 * Description of the property fechaconsulta.
	 */
	private LocalDate fechaconsulta = null;

	/**
	 * Description of the property sintomas.
	 */
	private String sintomas = "";

	/**
	 * Description of the property diagnostico.
	 */
	private String diagnostico = "";

	/**
	 * Description of the property receta.
	 */
	private String receta = "";

	// Start of user code (user defined attributes for Expedientes)

	// End of user code

	/**
	 * The constructor.
	 */
	public Expedientes() {
		// Start of user code constructor for Expedientes)
		super();
		// End of user code
	}
	
public Expedientes(String nombre, String rfc, LocalDate fechanacimiento, LocalDate fechaconsulta, String sintomas,
			String diagnostico, String receta) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechanacimiento = fechanacimiento;
		this.fechaconsulta = fechaconsulta;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.receta = receta;
	}
	/**
	 * Description of the method paciente.
	 * @param consultas 
	 * @param edad 
	 * @return 
	 */
	public String paciente(int consultas, int edad) {
		// Start of user code for method paciente
		String paciente = "";
		return paciente;
		// End of user code
	}

	// Start of user code (user defined methods for Expedientes)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public String getRfc() {
		return this.rfc;
	}

	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	/**
	 * Returns fechanacimiento.
	 * @return fechanacimiento 
	 */
	public LocalDate getFechanacimiento() {
		return this.fechanacimiento;
	}

	/**
	 * Sets a value to attribute fechanacimiento. 
	 * @param newFechanacimiento 
	 */
	public void setFechanacimiento(LocalDate newFechanacimiento) {
		this.fechanacimiento = newFechanacimiento;
	}

	/**
	 * Returns fechaconsulta.
	 * @return fechaconsulta 
	 */
	public LocalDate getFechaconsulta() {
		return this.fechaconsulta;
	}

	/**
	 * Sets a value to attribute fechaconsulta. 
	 * @param newFechaconsulta 
	 */
	public void setFechaconsulta(LocalDate newFechaconsulta) {
		this.fechaconsulta = newFechaconsulta;
	}

	/**
	 * Returns sintomas.
	 * @return sintomas 
	 */
	public String getSintomas() {
		return this.sintomas;
	}

	/**
	 * Sets a value to attribute sintomas. 
	 * @param newSintomas 
	 */
	public void setSintomas(String newSintomas) {
		this.sintomas = newSintomas;
	}

	/**
	 * Returns diagnostico.
	 * @return diagnostico 
	 */
	public String getDiagnostico() {
		return this.diagnostico;
	}

	/**
	 * Sets a value to attribute diagnostico. 
	 * @param newDiagnostico 
	 */
	public void setDiagnostico(String newDiagnostico) {
		this.diagnostico = newDiagnostico;
	}

	/**
	 * Returns receta.
	 * @return receta 
	 */
	public String getReceta() {
		return this.receta;
	}

	/**
	 * Sets a value to attribute receta. 
	 * @param newReceta 
	 */
	public void setReceta(String newReceta) {
		this.receta = newReceta;
	}

	@Override
	public String toString() {
		return "Expedientes [nombre=" + nombre + ", rfc=" + rfc + ", fechanacimiento=" + fechanacimiento
				+ ", fechaconsulta=" + fechaconsulta + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico
				+ ", receta=" + receta + "]";
	}

}

