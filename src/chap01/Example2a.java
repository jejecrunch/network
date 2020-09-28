package chap01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2a {

    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        FileInputStream in = new FileInputStream(sourceFile);
        FileOutputStream out = new FileOutputStream(targetFile);
        byte[] a = new byte[1024];
        while (true) {
            int count = in.read(a);
            if (count < 0) break;
            out.write(a, 0, count);
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        fileCopy("d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file2-1.txt", 
        		"d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file2-2.txt");
    }
}

