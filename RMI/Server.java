package RMI;

import java.rmi.*;


public class Server {
    public static void main(String args[]) {
        try {
            AddImplementation obj = new AddImplementation();

            Naming.rebind("rmi://localhost/AddService", obj);

            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
