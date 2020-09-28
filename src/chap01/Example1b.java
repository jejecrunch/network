package chap01;

import java.io.IOException;
import java.io.OutputStream;

public class Example1b {

    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int lastPrintableCharacter = 126;
        int size = (lastPrintableCharacter - firstPrintableCharacter + 1) + 2;
        byte[] a = new byte[size];
        int index = 0;
        // Example1a 내용에서 배열에 저장하는 것
        for (int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
            a[index++] = (byte)ch;
        a[index++] = '\r'; // CR, carriage return
        a[index++] = '\n'; // LF, line feed
        out.write(a);
    }

    public static void main(String[] args) throws IOException {
        generateCharacters(System.out); // up-casting
    }
}

