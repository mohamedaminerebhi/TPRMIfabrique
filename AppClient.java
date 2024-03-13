package fabrique;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 109);
        FabriqueInterface factory = (FabriqueInterface) registry.lookup("Factory");
        AppInterface app = factory.createAppInstance();
        System.out.println(app.Reverse("hello"));
}
}
