import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DomainLoadStoreParameter;
import java.time.LocalTime;

public class Server {
    public static void main(String[] args) throws IOException {
    int port = 1213;
    String host = "localhost";
    DataInputStream in;
    DataOutputStream out;
    Socket socket;
    ServerSocket server;
    LocalTime nutid = LocalTime.now();

    server = new ServerSocket(port);
    socket = server.accept();

    in = new DataInputStream(socket.getInputStream());
    out = new DataOutputStream(socket.getOutputStream());
        String domaene = in.readUTF();

        InetAddress address = InetAddress.getByName(domaene);
        System.out.println("Host name" + address.getHostName());
        System.out.println("IP Adresse" + address.getHostAddress());
    }
}
