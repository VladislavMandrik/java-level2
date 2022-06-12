import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8190)) {
            System.out.println("Ждем подключения клиента... ");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    String message = scanner.nextLine();
                    try {
                        if ("/end".equalsIgnoreCase(message)) {
                            out.writeUTF("/end");
                            break;
                        }
                        out.writeUTF(message);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true) {
                String message = in.readUTF();
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);
                out.writeUTF("[echo] " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

