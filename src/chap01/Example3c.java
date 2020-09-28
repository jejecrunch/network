package chap01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3c {

    static int receive(InputStream in, byte[] a, int bytesToRead) throws IOException {
        int bytesRead = 0;
        // 지정한 크기의 데이터를 전부 읽기 전에 입력 스트림의 끝에 도달하면
        while (bytesRead < bytesToRead) {
        	// 현재까지 읽은 데이터가 a 배열에 채워진 채로 리턴한다.
            int result = in.read(a, bytesRead, bytesToRead - bytesRead);
            // 입력 스트림의 끝에 대한 코드
            if (result == -1) break; // end of stream 
            bytesRead += result;
        }
        return bytesRead;
    }

    public static void main(String[] args) throws IOException {
        byte[] a = new byte[10];
        int bytesRead = receive(System.in, a, 10);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, bytesRead)));
    }

}

