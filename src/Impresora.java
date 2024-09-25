import java.rmi.*;

/*Interfaz de la impresora*/
public interface Impresora extends Remote {
	
	/**
	 * La impresora realiza una impresion ya sea a blanco y negro, o a color.
	 * Estp dependera del piso en el que se encuentre el empleado
	 */
	public String imprimir() throws RemoteException;

}