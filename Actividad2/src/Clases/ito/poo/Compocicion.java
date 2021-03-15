package Clases.ito.poo;
import java.time.LocalDate;
public class Compocicion {
	// Start of user code (user defined imports)

	// End of user code

	/**
	 * Description of Composicion.
	 * 
	 * @author emman
	 */
	public class Composicion {

		/**
		 * Description of the property titulo.
		 */
		private String titulo = "";

		/**
		 * Description of the property duracion.
		 */
		private float duracion = 0F;

		/**
		 * Description of the property interpretes.
		 */
		private String interpretes = "";

		/**
		 * Description of the property genero.
		 */
		private String genero = "";

		/**
		 * Description of the property fechaderegistro.
		 */
		private LocalDate fechaderegistro = null;

		/**
		 * Description of the property fechadeestreno.
		 */
		private LocalDate fechadeestreno = null;

		// Start of user code (user defined attributes for Composicion)

		// End of user code

		/**
		 * The constructor.
		 */
		public Composicion() {
			// Start of user code constructor for Composicion)
			super();
			// End of user code
		}
		
		public Composicion(String titulo, float duracion, String interpretes, String genero, LocalDate fechaderegistro,
				LocalDate fechadeestreno) {
			super();
			this.titulo = titulo;
			this.duracion = duracion;
			this.interpretes = interpretes;
			this.genero = genero;
			this.fechaderegistro = fechaderegistro;
			this.fechadeestreno = fechadeestreno;
		}
		
		/**
		 * Description of the method interpretes.
		 * @param musico 
		 * @return 
		 */
		public String interpretes(String musico) {
			// Start of user code for method interpretes
			String interpretes = "";
			return interpretes;
			// End of user code
		}

		// Start of user code (user defined methods for Composicion)

		// End of user code
		/**
		 * Returns titulo.
		 * @return titulo 
		 */
		public String getTitulo() {
			return this.titulo;
		}

		/**
		 * Sets a value to attribute titulo. 
		 * @param newTitulo 
		 */
		public void setTitulo(String newTitulo) {
			this.titulo = newTitulo;
		}

		/**
		 * Returns duracion.
		 * @return duracion 
		 */
		public float getDuracion() {
			return this.duracion;
		}

		/**
		 * Sets a value to attribute duracion. 
		 * @param newDuracion 
		 */
		public void setDuracion(float newDuracion) {
			this.duracion = newDuracion;
		}

		/**
		 * Returns interpretes.
		 * @return interpretes 
		 */
		public String getInterpretes() {
			return this.interpretes;
		}

		/**
		 * Sets a value to attribute interpretes. 
		 * @param newInterpretes 
		 */
		public void setInterpretes(String newInterpretes) {
			this.interpretes = newInterpretes;
		}

		/**
		 * Returns genero.
		 * @return genero 
		 */
		public String getGenero() {
			return this.genero;
		}

		/**
		 * Sets a value to attribute genero. 
		 * @param newGenero 
		 */
		public void setGenero(String newGenero) {
			this.genero = newGenero;
		}

		/**
		 * Returns fechaderegistro.
		 * @return fechaderegistro 
		 */
		public LocalDate getFechaderegistro() {
			return this.fechaderegistro;
		}

		/**
		 * Sets a value to attribute fechaderegistro. 
		 * @param newFechaderegistro 
		 */
		public void setFechaderegistro(LocalDate newFechaderegistro) {
			this.fechaderegistro = newFechaderegistro;
		}

		/**
		 * Returns fechadeestreno.
		 * @return fechadeestreno 
		 */
		public LocalDate getFechadeestreno() {
			return this.fechadeestreno;
		}

		/**
		 * Sets a value to attribute fechadeestreno. 
		 * @param newFechadeestreno 
		 */
		public void setFechadeestreno(LocalDate newFechadeestreno) {
			this.fechadeestreno = newFechadeestreno;
		}

		@Override
		public String toString() {
			return "Composicion [titulo=" + titulo + ", duracion=" + duracion + ", interpretes=" + interpretes + ", genero="
					+ genero + ", fechaderegistro=" + fechaderegistro + ", fechadeestreno=" + fechadeestreno + "]";
		}

	}


