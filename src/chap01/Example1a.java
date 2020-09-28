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
    	generateCharacters(System.out); // up-casting, �ܼ�â ȭ�鿡 ���
        generateCharacters(new FileOutputStream("d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file1.txt")); // up-casting, �ؽ�Ʈ ���� ���ο� ���
    }
}

