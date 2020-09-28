package chap01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2c {

    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(sourceFile);
            out = new FileOutputStream(targetFile);
            byte[] a = new byte[1024];
            while (true) {
                int count = in.read(a);
                if (count < 0) break;
                out.write(a, 0, count);
            }
        }
        finally {
        	// close 함수를 쓴다고 하더라도 예외 발생 가능
        	// 예외를 무시하기 위한 try catch 블럭 삽입
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	fileCopy("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file2-1.txt", 
				"d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file2-2.txt");
	}
}

