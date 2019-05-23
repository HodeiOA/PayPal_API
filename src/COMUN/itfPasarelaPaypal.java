package COMUN;

import java.rmi.Remote;

public interface itfPasarelaPaypal extends Remote
{
	boolean RealizarPago(String numTarjetaCredito);
}
