package chap01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3b {

    static void receive(InputStream in, byte[] a, int bytesToRead) throws IOException {
        int bytesRead = 0;
        // ������ �� ��ŭ�� �����Ͱ� ���� ������ ������ ���ư��� �ݺ���
        while (bytesRead < bytesToRead) {
        	// ������ �� ��ŭ�� �����͸� �� ���� �� a �迭�� ä��� �����Ѵ�
            bytesRead  += in.read(a, bytesRead, bytesToRead - bytesRead);
        }
    }

    public static void main(String[] args) throws IOException {
        byte[] a = new byte[10];
        receive(System.in, a, 10);
        System.out.println(Arrays.toString(a));
    }

}

