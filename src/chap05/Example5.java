package chap05;

import java.net.URI;
import java.net.URISyntaxException;

public class Example5 {

    public static void main(String[] args) throws URISyntaxException {
        URI 泅犁林家 = new URI("http://localhost:8088/student/list");
        String 惑措林家 = "edit?id=3";

        URI 例措林家 = 泅犁林家.resolve(惑措林家);
        System.out.println(例措林家);
    }

}

