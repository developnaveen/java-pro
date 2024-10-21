
import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // Auto-flush enabled
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to the server.");
            String message;
            while (true) {
                System.out.print("Enter a message (type 'exit' to quit): ");
                message = userInput.readLine();
                if (message.equalsIgnoreCase("exit")) break;
                out.println(message);  // Send message to server
                System.out.println("Server response: " + in.readLine());  // Read and print server's response
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
