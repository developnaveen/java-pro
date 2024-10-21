

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Get the registry where the remote object is registered
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the remote object by name
            RemoteCalculator calculator = (RemoteCalculator) registry.lookup("CalculatorService");

            // Call the remote method
            int result = calculator.add(10, 20);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
