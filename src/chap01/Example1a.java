package chap01;

import java.io.IOException;
import java.io.OutputStream;

public class Example1a {

    public static void generateCharacters (OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int lastPrintableCharacter = 126;
        // ascii code 33 ~ 126
        for (int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
            out.write(ch);
        out.write('\r'); // CR, carriage return
        out.write('\n'); // LF, line feed
    }

    public static void main(String[] args) throws IOException {
        generateCharacters(System.out); // up-casting
    }
}

