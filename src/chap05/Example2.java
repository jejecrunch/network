package chap05;

import java.net.MalformedURLException;
import java.net.URL;

public class Example2 {

    public static void main(String[] args) throws MalformedURLException {
        URL urlA = new URL("http://www.ibiblio.com");
        URL urlB = new URL("http://ibiblio.com");
        System.out.println(urlA.equals(urlB)); // A와 B는 호스트네임만 다르고 ip 주소는 동일하기 때문에 true

        URL urlC = new URL("https://www.ibiblio.com");
        System.out.println(urlA.equals(urlC)); // A와 C는 프로토콜이 다르기 때문에 false
    }

}

