import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
  public static void main(String[] args){
    System.out.println("Your code goes here!");

    //  Uncomment this block to pass the first stage
    //    ServerSocket serverSocket = null;
    //    Socket clientSocket = null;
    //    int port = 6379;
    //    try {
    //      serverSocket = new ServerSocket(port);
    //      serverSocket.setReuseAddress(true);
    //      // Wait for connection from client.
    //      clientSocket = serverSocket.accept();
    //    } catch (IOException e) {
    //      System.out.println("IOException: " + e.getMessage());
    //    } finally {
    //      try {
    //        if (clientSocket != null) {
    //          clientSocket.close();
    //        }
    //      } catch (IOException e) {
    //        System.out.println("IOException: " + e.getMessage());
    //      }
    //    }
  }
}
