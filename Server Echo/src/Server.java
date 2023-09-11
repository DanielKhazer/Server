import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 1213;
        String host = "localhost";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;
        ServerSocket server;

        server = new ServerSocket(port);
        socket = server.accept();

        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        System.out.println(in.readUTF());
        //UTF er en oversættelses metode fra bytes til bogstaver
        out.writeDouble(13);




    }
}
