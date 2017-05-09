package java1702.javase.io;

import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:55.
 */
public class JianDanTest implements Runnable {
    private static int counter = 0;
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";
    private int page;

    private JianDanTest(int page) {
        this.page = page;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            Thread thread = new Thread(new JianDanTest(i + 1));
            thread.start();
            System.out.println("page: " + (i + 1));
        }
    }

    @Override
    public void run() {
        try {
            URL url = new URL(PAGE_URL + page);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("data-original")) {
                        String imageUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                        if (!imageUrl.startsWith("http")) {
                            imageUrl = "http:" + imageUrl;
                        }
                        String extension = imageUrl.substring(imageUrl.lastIndexOf("."));
                        download(imageUrl, extension, page);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imageUrl, String extension, int page) {
        try {
            URL url = new URL(imageUrl);
            try (
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + page + "-" + (++counter) + extension))
            ) {
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                System.out.println("\t" + page + "-" + counter);
            } catch (ConnectException e) {
                System.out.println("timeout...");
//                download(imageUrl, extension);
                System.out.println(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
