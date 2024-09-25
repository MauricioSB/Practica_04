public class Empleado {

	/*Es el nombre del empleado*/
	private String nombre;
	/*El rfc del empleado*/
	private String rfc;
	/*Es el area de trabajo del empleado*/
	private String area;
	/*El numero de piso donde esta el empleado*/
	private String piso;

	/**
	 * Es el constructor de nuestra clase empleado
	 * @param nombre es el nombre del empleado
	 * @param rfc el rfc del empleado
	 * @param area es el area donde trabaja el empleado
	 * @param piso es el piso donde trabaja el empleado
	 **/ 
	public Empleado(String nombre, String rfc, String area, String piso) {
		this.nombre = nombre;
		this.rfc = rfc;
		this.area = area;
		this.piso = piso;
	}

	/*Obtenemos el nombre del empleado*/
	public String getNombre() {
		return nombre;
	}

	/**
	 * Ingresamos el nombre del empleado que trabaja en la empresa
	 * @param nombre es el nombre que tiene el empleado
	 **/
	 public void setNombre(String nombre) {
	 	this.nombre = nombre;
	 } 

	/*Obtenemos el rfc del empleado*/
	public String getRFC() {
		return rfc;
	}

	/**
	 * Ingresamos el rfc del empleado que trabaja en la empresa
	 * @param rfc es el rfc del empleado
	 **/
	 public void setRFC(String rfc) {
	 	this.rfc = rfc;
	 }	

	/*Obtenemos el area de trabajo que pertenece el empleado*/
	public String getAreaDeTrabajo() {
		return area;
	}

	/**
	 * Ingresamos el area de trabajo del empleado que pertenece en la empresa
	 * @param area es el area de trabajo que realiza el empleado
	 **/
	 public void setAreaDeTrabajo(String area) {
	 	this.area = area;
	 }		

	/*Obtenemos el piso donde trabaja el empleado*/
	public String getPiso() {
		return piso;
	}	  	 

	/**
	 * Ingresamos el piso donde trabaja el empleado 
	 * @param piso es el piso donde trabaja el empleado
	 **/
	 public void setPiso(String piso) {
	 	this.piso = piso;
	 }

	 /**
	  * Manda a imprimir un archivo del empleado a la impresora ya sea a color o blanco y negro
	  * @param tipoImpresion es el tipo de impresion que quiere el empleado, sea a color o blanco y negro
	  * @return regresa el archivo que se va a imprimir
	  **/ 
	 public String mandarImprimir(String tipoImpresion) {
	 	if (tipoImpresion == null) {
	 		return null;
	 	} else if (tipoImpresion.equalsIgnoreCase("color")) {
	 		String archivo = " ";
	 		return archivo;
	 	} else if (tipoImpresion.equalsIgnoreCase("blanconegro")) {
	 		String archivo = " ";
	 		return archivo;
	 	}
	 	return null;
	 }

	 /**
	  * Se crea una cadena que va a mostrar un mensaje de quien esta mandando a imprimir
	  **/ 
	 public String toString() {
	 	String s = "El empleado: " + nombre + " " + "del piso" + piso + " " + "solicito una impresion de tipo: " + " " + "Area de trabajo: " + area;
	 	return s; 
	 }
	
}