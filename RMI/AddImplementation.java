package RMI;
import java.rmi.*;
import java.rmi.server.*;


public class AddImplementation extends UnicastRemoteObject implements AddInterface{
    public AddImplementation() throws RemoteException{

        super();

    }
    
    public int add(int a , int b) throws RemoteException{
        return a+b;
    }
}
