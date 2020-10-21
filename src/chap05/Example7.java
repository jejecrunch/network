package chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Example7 {

    public static void main(String[] args) throws Exception {

        String listUrl = "http://www.skhu.ac.kr/board/boardlist.aspx?curpage=1&bsid=10004&searchBun=51";
        String html = getHttpResponse(listUrl);

        System.out.println(html);
    }

    static String getHttpResponse(String url) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)urlObj.openConnection();

        // HTTP request header�� ������ ä���
        connection.setRequestMethod("GET");                          // GET ������� ��û�Ѵ�.
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");  // ����������ô �Ѵ�

        // HTTP response header �������� ���� ���ڵ��� �ľ��Ѵ�.
        // ���� ���ڵ��� UTF-8 �ƴϸ� EUC-KR �� ���� �ϳ���� �����Ѵ�. (�ѱ� ����������� ����)
        String contentType = connection.getContentType();
        String encoding = (contentType.toUpperCase().indexOf("UTF-8") >= 0) ? "UTF-8" : "EUC-KR";

        // HTTP Response ����(body)�� �о ���ڿ��� �����Ѵ�.
        StringBuffer builder = new StringBuffer();
        try (BufferedReader input =
                new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding))) {
            String s;
            while ((s = input.readLine()) != null) {
                builder.append(s);
                builder.append('\n');
            }
        }
        return builder.toString();
    }

}

