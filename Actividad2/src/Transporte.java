import Clases.ito.poo;
import java.time.LocalDate;
public class Transporte {
	
	 
		private String marca = "";

		/**
		 * Description of the property modelo.
		 */
		private String modelo = "";

		/**
		 * Description of the property cargamaxima.
		 */
		private float cargamaxima = 0F;

		/**
		 * Description of the property fechaadquisicion.
		 */
		private LocalDate fechaadquisicion = null;

		/**
		 * Description of the property viajesrealizados.
		 */
		private int viajesrealizados = 0;

		// Start of user code (user defined attributes for Transporte)

		// End of user code

		/**
		 * The constructor.
		 */
		public Transporte() {
			// Start of user code constructor for Transporte)
			super();
			// End of user code
		}
		
		public Transporte(String marca, String modelo, float cargamaxima, LocalDate fechaadquisicion,
				int viajesrealizados) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.cargamaxima = cargamaxima;
			this.fechaadquisicion = fechaadquisicion;
			this.viajesrealizados = viajesrealizados;
		}

		/**
		 * Description of the method viajesrealizados.
		 * @param Destino 
		 * @param Direccion 
		 * @param fechaViaje 
		 * @param fechaRegreso 
		 * @param carga 
		 * @param monto 
		 */
		public void viajesrealizados(String Destino, String Direccion,LocalDate fechaViaje,
				LocalDate fechaRegreso, String carga, float monto) {
			// Start of user code for method viajesrealizados
			// End of user code
		}

		/**
		 * Description of the method contratacion.
		 * @param vehicilo 
		 * @param carga 
		 */
		public void contratacion(String vehicilo, String carga) {
			// Start of user code for method contratacion
			// End of user code
		}

		/**
		 * Description of the method viajesCancelados.
		 * @param vehiculo 
		 */
		public void viajesCancelados(String vehiculo) {
			// Start of user code for method viajesCancelados
			// End of user code
		}

		// Start of user code (user defined methods for Transporte)

		// End of user code
		/**
		 * Returns marca.
		 * @return marca 
		 */
		public String getMarca() {
			return this.marca;
		}

		/**
		 * Sets a value to attribute marca. 
		 * @param newMarca 
		 */
		public void setMarca(String newMarca) {
			this.marca = newMarca;
		}

		/**
		 * Returns modelo.
		 * @return modelo 
		 */
		public String getModelo() {
			return this.modelo;
		}

		/**
		 * Sets a value to attribute modelo. 
		 * @param newModelo 
		 */
		public void setModelo(String newModelo) {
			this.modelo = newModelo;
		}

		/**
		 * Returns cargamaxima.
		 * @return cargamaxima 
		 */
		public float getCargamaxima() {
			return this.cargamaxima;
		}

		/**
		 * Sets a value to attribute cargamaxima. 
		 * @param newCargamaxima 
		 */
		public void setCargamaxima(float newCargamaxima) {
			this.cargamaxima = newCargamaxima;
		}

		/**
		 * Returns fechaadquisicion.
		 * @return fechaadquisicion 
		 */
		public LocalDate getFechaadquisicion() {
			return this.fechaadquisicion;
		}

		/**
		 * Sets a value to attribute fechaadquisicion. 
		 * @param newFechaadquisicion 
		 */
		public void setFechaadquisicion(LocalDate newFechaadquisicion) {
			this.fechaadquisicion = newFechaadquisicion;
		}

		/**
		 * Returns viajesrealizados.
		 * @return viajesrealizados 
		 */
		public int getViajesrealizados() {
			return this.viajesrealizados;
		}

		/**
		 * Sets a value to attribute viajesrealizados. 
		 * @param newViajesrealizados 
		 */
		public void setViajesrealizados(int newViajesrealizados) {
			this.viajesrealizados = newViajesrealizados;
		}

		@Override
		public String toString() {
			return "Transporte [marca=" + marca + ", modelo=" + modelo + ", cargamaxima=" + cargamaxima
					+ ", fechaadquisicion=" + fechaadquisicion + ", viajesrealizados=" + viajesrealizados + "]";
		}

	}
