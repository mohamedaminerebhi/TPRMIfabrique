package fabrique;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AppImpl extends UnicastRemoteObject implements AppInterface {
    protected AppImpl() throws RemoteException {
        super();
    }

    @Override
    public String Reverse(String str) throws RemoteException {
        return new StringBuilder(str).reverse().toString();

    }
}

