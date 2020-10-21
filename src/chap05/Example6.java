package chap05;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Example6 {

    public static void main(String[] args) throws UnsupportedEncodingException  {

        // 牢内爹 坷幅
        String s = "http://www.google.com/search?q=蕊何 愁何";
        String urla = URLEncoder.encode(s, "UTF-8");
        System.out.println(urla);

        // 牢内爹 OK
        String urlb = "http://www.google.com/search?q=" + URLEncoder.encode("蕊何 愁何", "UTF-8");
        System.out.println(urlb);

        // 叼内爹 Ok
        String t = URLDecoder.decode(urlb, "UTF-8");
        System.out.println(t);
    }

}

