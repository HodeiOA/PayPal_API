package COMUN;

import java.rmi.Remote;

public interface itfPasarela extends Remote
{
	boolean ValidarPago(String numTarjetaCredito);
}
