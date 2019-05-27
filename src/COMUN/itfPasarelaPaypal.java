package COMUN;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface itfPasarelaPaypal extends Remote
{
	boolean RealizarPago(String numTarjetaCredito) throws RemoteException;
}
