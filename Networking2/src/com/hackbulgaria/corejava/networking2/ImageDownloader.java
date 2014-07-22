package com.hackbulgaria.corejava.networking2;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ImageDownloader {
    public static void main(String[] args) {
        try {
            URL photo = new URL("http://www.emperor-penguin.com/penguin-chick.jpg");
            URL video = new URL("http://search.data.bg/download/ZGJnZGxfMjc4Mjg5NjE=");

            byte[] byteArray = IOUtils.toByteArray(photo.openStream());
            String pathName = "E:\\Adii\\Documents\\CoreJava\\resources\\random.jpg";

            // FileOutputStream fileOutputStream = new FileOutputStream(
            // "E:\\Adii\\Documents\\CoreJava\\resources\\random.jpg");
            // fileOutputStream.write(byteArray);
            // fileOutputStream.close();

            // BufferedImage image = ImageIO.read(new
            // ByteArrayInputStream(byteArray));
            // ImageIO.write(image, "jpg", new File(pathname));

            FileUtils.writeByteArrayToFile(new File(pathName), byteArray);

            Runtime.getRuntime().exec("explorer.exe " + pathName);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
