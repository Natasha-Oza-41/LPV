package RMI;

import java.rmi.*;

public class Client {
    public static void main(String args[]) {
        try {
            AddInterface obj = (AddInterface) Naming.lookup("rmi://localhost/AddService");

            int result = obj.add(10, 20);

            System.out.println("Addition Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}