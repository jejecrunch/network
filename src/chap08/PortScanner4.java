package chap08;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PortScanner4 {

    static class PortTask implements Runnable {
        String host;
        int port, timeout;

        public PortTask(String host, int port, int timeout) {
            this.host = host;
            this.port = port;
            this.timeout = timeout;
        }

        @Override
        public void run() {
            StringBuilder builder = new StringBuilder();
            builder.append(host).append(' ').append(port).append(' ' );
            try (Socket socket = new Socket()) {
                SocketAddress address = new InetSocketAddress(host, port);
                socket.connect(address, timeout);
                builder.append("연결 성공");
            } catch (ConnectException e) {
                // 연결할 수 없다
                return;
            } catch (SocketTimeoutException e) {
                // 연결할 수 없다
                return;
            } catch (Exception e) {
                builder.append(e.getClass().getName()).append(' ' ).append(e.getMessage());
            }
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {
        String host = "www.skhu.ac.kr"; int timeout = 300;
        int portFrom = 1, portTo = 10000;

        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int port = portFrom; port <= portTo; ++port) {
            executor.submit(new PortTask(host, port, timeout));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
        }
        System.out.println("DONE");
    }

}

