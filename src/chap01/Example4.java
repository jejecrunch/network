package chap01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Example4 {

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file3.txt");
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
        writer.write("�ȳ��ϼ���");
        writer.close();
    }

}