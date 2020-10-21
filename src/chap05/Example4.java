package chap05;

import java.net.URI;
import java.net.URISyntaxException;

public class Example4 {

    public static void main(String[] args) throws URISyntaxException {
        URI uriA = new URI("http://www.ibiblio.com");
        URI uriB = new URI("http://ibiblio.com");
        System.out.println(uriA.equals(uriB)); // 찾아보니까 URI는 스키마별 부분이 모두 동일해야하는데 호스트네임이 달라서 false

        URI uriC = new URI("https://www.ibiblio.com");
        System.out.println(uriA.equals(uriC)); // 프로토콜이 다름

        URI uriD = new URI("HTTP://WWW.IBIBLIO.COM");
        System.out.println(uriA.equals(uriD)); // 대소문자 무관하기 때문에 동일
    }

}

