package chap01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2e {

    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(targetFile)) {
            while (true) {
            	// �Է� ��Ʈ������ ���� ���ڸ� �о�´�.
                int b = in.read();
                // ���� ���ڰ� ���̻� �������� ������ �ݺ����� �����.
                if (b == -1) break;
                // �о�� ���ڸ� Ÿ�����Ͽ� �Է��Ѵ�.
                out.write(b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	fileCopy("d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file2-1.txt", 
				"d:/1_university/000 ����/����Ʈ������а�/���ǳ�������/3�г� 2�б�/��Ʈ��ũ���α׷���/�ǽ�/temp/file2-2.txt");
	}
}

