package COMUN;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

import APIs.itfPasarelaPaypal;

public class clsMain
{

	public static void main(String[] args)
	{
		String IP = "127.0.0.1";
		String Puerto = "1096";
		String NombreServicio = "PayPal";
		
		if (System.getSecurityManager() == null)
		{
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + IP + ":" + Puerto + "/" + NombreServicio;

		try {		
			itfPasarelaPaypal objServer = new clsPaypal();
			Registry registry = LocateRegistry.createRegistry((Integer.valueOf(Puerto)));
			//Naming.rebind(name, objServer);
			registry.rebind(name, objServer);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
