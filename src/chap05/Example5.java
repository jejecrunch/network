package chap05;

import java.net.URI;
import java.net.URISyntaxException;

public class Example5 {

    public static void main(String[] args) throws URISyntaxException {
        URI �����ּ� = new URI("http://localhost:8088/student/list");
        String ����ּ� = "edit?id=3";

        URI �����ּ� = �����ּ�.resolve(����ּ�);
        System.out.println(�����ּ�);
    }

}

