package chap05;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Example6 {

    public static void main(String[] args) throws UnsupportedEncodingException  {

        // ���ڵ� ����
        String s = "http://www.google.com/search?q=��� ���";
        String urla = URLEncoder.encode(s, "UTF-8");
        System.out.println(urla);

        // ���ڵ� OK
        String urlb = "http://www.google.com/search?q=" + URLEncoder.encode("��� ���", "UTF-8");
        System.out.println(urlb);

        // ���ڵ� Ok
        String t = URLDecoder.decode(urlb, "UTF-8");
        System.out.println(t);
    }

}

