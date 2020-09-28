package chap01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3b {

    static void receive(InputStream in, byte[] a, int bytesToRead) throws IOException {
        int bytesRead = 0;
        // 지정한 수 만큼의 데이터가 전부 도착할 때까지 돌아가는 반복문
        while (bytesRead < bytesToRead) {
        	// 지정한 수 만큼의 데이터를 다 읽은 후 a 배열에 채우고 리턴한다
            bytesRead  += in.read(a, bytesRead, bytesToRead - bytesRead);
        }
    }

    public static void main(String[] args) throws IOException {
        byte[] a = new byte[10];
        receive(System.in, a, 10);
        System.out.println(Arrays.toString(a));
    }

}

