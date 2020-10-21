package chap05;

import java.net.URI;
import java.net.URISyntaxException;

public class Example4 {

    public static void main(String[] args) throws URISyntaxException {
        URI uriA = new URI("http://www.ibiblio.com");
        URI uriB = new URI("http://ibiblio.com");
        System.out.println(uriA.equals(uriB)); // ã�ƺ��ϱ� URI�� ��Ű���� �κ��� ��� �����ؾ��ϴµ� ȣ��Ʈ������ �޶� false

        URI uriC = new URI("https://www.ibiblio.com");
        System.out.println(uriA.equals(uriC)); // ���������� �ٸ�

        URI uriD = new URI("HTTP://WWW.IBIBLIO.COM");
        System.out.println(uriA.equals(uriD)); // ��ҹ��� �����ϱ� ������ ����
    }

}

