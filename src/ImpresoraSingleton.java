import java.util.Queue;
import java.rmi.*;
import java.rmi.server.*;

public class ImpresoraSingleton extends UnicastRemoteObject implements Impresora {
	
	private static final long serialVersionUID = 1L;

	/*Es el empleado que mando a imprimir un archivo*/
	private Empleado empleado;
	/*Es la cola que va a estar almacenando las solicitudes de impresion de los empleados*/
	//por ver si se requiere algo mas
	private Queue cola = new Queue();

	/*Constructor privado de la clase ImpresoraSingleton*/
	private static ImpresoraSingleton instanciaUnica;

	/*Constructor privado que evita la creacion externa de una impresora*/
	private ImpresoraSingleton() {}

	/**
	 * Obtenemos la instancia unica de nuestra impresora, verifica que en dado caso que no haya una
	 * se crea una
	 * @throws RemoteException en dado caso que se llegue a perder la conexion
	 * @return la instancia unica con la que se va a trabajar
	 **/ 
	public static ImpresoraSingleton getInstance() throws RemoteException {
		try {
			if (instanciaUnica == null) {
				instanciaUnica = new ImpresoraSingleton();
				//Naming.rebind("Impresora Remota", service);
			}
			return instanciaUnica;
		} catch(RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Imprime el archivo que le mando el empleado ya sea a color o blanco y negro
	 * @param archivo es el documento que mando a imprimir el empleado
	 * @return una cadena el cual avisa que se va a imprimir
	 * @throws RemoteException en dado caso que se llegue a interrumpir la conexion
	 **/ 
	@Override
	public String imprimir(String archivo) throws RemoteException {
		try {
			if (this.empleado.getPisoAreaDeTrabajo() == "mercadotecnia") {
				imprimirColor(archivo);
			} else {
				imprimirBlancoNegro(archivo);
			}
		} catch(RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Verificamos el area en el que trabaja el empleado para saber que tipo de impresion se va hacer
	 * @param empleado es el empleado que va a imprimir
	 * @return true en dado caso que el empleado es de mercadotecnica o false en caso contrario
	 **/ 
	/*public boolean verificarArea(Empleado empleado) throws RemoteException {
		try {
			boolean verificado = false;
			if (empleado.getPisoAreaDeTrabajo() == "mercadotecnia") {
				return verificado = true;
			} else {
				return verificado;
			}
		} catch(RemoteException e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Manda a imprimir un archivo a blanco y negro
	 * @param archivo es el archivo que se va a imprimir en blanco y negro
	 * @return regresa una cadena que avisa que se esta imprimiendo en blanco y negro
	 **/ 
	public String imprimirBlancoNegro(String archivo) throws RemoteException {
		try {
			return String archivo = "Se esta imprimiendo el documento en blanco y negro";
		} catch(RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Manda a imprimir un archivo a blanco y negro
	 * @param archivo es el archivo que se va a imprimir a color
	 * @return regresa una cadena que avisa que se esta imprimiendo a color
	 **/
	public String imprimirColor(String archivo) throws RemoteException {
		try {
			return String archivo = "Se esta imprimiendo el documento en color";
		} catch(RemoteException e) {
			e.printStackTrace();
		}		
	}

}