package chap01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2e {

    public static void fileCopy(String sourceFile, String targetFile) throws IOException {
        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(targetFile)) {
            while (true) {
            	// 입력 스트림에서 읽을 문자를 읽어온다.
                int b = in.read();
                // 읽을 문자가 더이상 존재하지 않으면 반복문을 멈춘다.
                if (b == -1) break;
                // 읽어온 문자를 타겟파일에 입력한다.
                out.write(b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	fileCopy("d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file2-1.txt", 
				"d:/1_university/000 전공/소프트웨어공학과/강의내용정리/3학년 2학기/네트워크프로그래밍/실습/temp/file2-2.txt");
	}
}

