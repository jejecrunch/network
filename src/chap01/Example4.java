package chap01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Example4 {

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file3.txt");
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
        writer.write("안녕하세요");
        writer.close();
    }

}