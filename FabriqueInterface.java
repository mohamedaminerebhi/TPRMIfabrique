package fabrique;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FabriqueInterface extends Remote {
    // Méthode pour créer une instance de l'interface distante
  public   AppInterface createAppInstance() throws RemoteException;
}
