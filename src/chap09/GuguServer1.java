package chap09;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GuguServer1 {

    public static void main(String[] args) {
        final int PORT = 9090;
        try (ServerSocket server = new ServerSocket(PORT)) {
            ExecutorService executor = Executors.newFixedThreadPool(500);
            while (true) {
                try {
                    Socket socket = server.accept();
                    executor.submit(new GuguTask(socket));
                } catch (IOException ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    static class GuguTask implements Runnable {
        Socket socket;

        public GuguTask(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (Socket autoClose = socket) {
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                while (true) {
                    int a = in.readInt();
                    int b = in.readInt();
                    out.writeInt(a * b);
                    out.flush();
                }
            } catch (IOException ex) {
            }
        }
    }
}

