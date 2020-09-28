package chap01;

import java.io.FileOutputStream;
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
    	generateCharacters(System.out); // up-casting, 콘솔창 화면에 출력
        generateCharacters(new FileOutputStream("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file1.txt")); // up-casting, 텍스트 파일 내부에 출력
    }
}

