import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        int port = 1213;
        String host = "localhost";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;


        socket = new Socket(host, port);
        in = new DataInputStream(socket.getInputStream());
        System.out.println(in.readUTF());


    }
}