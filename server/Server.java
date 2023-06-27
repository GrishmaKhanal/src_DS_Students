package src.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            
            dbProcess proc = new ProcessImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("ProcessService", proc);

            System.out.println("Server is running and waiting for client requests");
        } catch (Exception e) {
            System.out.println("Server Exception: "+ e.getMessage());
        }
    }
}