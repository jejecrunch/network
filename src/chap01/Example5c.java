package chap01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5c {

    public static String readFile(String filePath, String encoding) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath), encoding)))
        {
            StringBuilder builder = new StringBuilder();
            char[] a = new char[1024];
            while (true) {
                int count = reader.read(a);
                if (count == -1) break;
                builder.append(a, 0, count);
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        String s = readFile("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file3.txt", "UTF-8");
        System.out.println(s);
    }

}