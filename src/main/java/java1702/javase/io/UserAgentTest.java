package java1702.javase.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zhoumeng on
 * 2017/4/28.
 * 13:36.
 */
public class UserAgentTest {
    private static final String USER_AGENT = "Mozilla";
    private static final String IMAGE_URL = "https://wallpapers.wallhaven.cc/wallpapers/full/wallhaven-509708.jpg";

    public static void main(String[] args) throws IOException {
        URL url = new URL(IMAGE_URL);
        System.setProperty("http.agent", USER_AGENT); // 这句话要放在 httpURLConnection 对象创建之前
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try (
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(" user-agent.jpg"))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        }
    }
}
