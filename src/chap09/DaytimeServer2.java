package chap09;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DaytimeServer2 {

    public static void main(String[] args) {
        final int PORT = 13;
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                try (Socket socket = server.accept()) {
                    Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                    Date now = new Date();
                    out.write("���� �ð�: ");
                    out.write(now.toString());
                    out.write("\r\n");
                    out.flush();
                } catch (IOException ex) {
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}

