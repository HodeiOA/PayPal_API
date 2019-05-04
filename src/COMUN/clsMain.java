package COMUN;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;

public class clsMain
{

	public static void main(String[] args)
	{
		if (System.getSecurityManager() == null)
		{
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {		
			itfPasarela objServer = new clsPaypal();
			Registry registry = LocateRegistry.createRegistry((Integer.valueOf(args[1])));
			//Naming.rebind(name, objServer);
			registry.rebind(name, objServer);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
