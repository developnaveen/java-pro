
import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Listening for connections...");
            while (true) {
                // Wait for a client to connect
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)  // Auto-flush enabled
                ) {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Received from client: " + message);  // Display the message on the server side
                        out.println("Server received: " + message);  // Respond to the client
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Client disconnected: " + clientSocket.getInetAddress());
                clientSocket.close();  // Ensure the socket is closed when the client disconnects
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
