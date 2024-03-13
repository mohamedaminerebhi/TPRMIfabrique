package fabrique;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(109);
        FabriqueInterface factory = new FabImpl();
        registry.rebind("Factory", factory);
        System.out.println("Serveur prêt.");
    }
}

