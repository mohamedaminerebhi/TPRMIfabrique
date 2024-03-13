package fabrique;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabImpl extends UnicastRemoteObject implements FabriqueInterface {
    protected FabImpl() throws RemoteException {
        super();
    }

    @Override
    public AppInterface createAppInstance() throws RemoteException {
        // Créez et retournez une instance de l'interface distante
        return new AppImpl();
    }
}

