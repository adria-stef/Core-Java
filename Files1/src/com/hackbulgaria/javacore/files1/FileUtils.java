package com.hackbulgaria.javacore.files1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtils {

    private FileUtils() {
        super();
    }

    public static String readFrom(File file) throws IOException {

        Path path = file.toPath();
        String string = new String(readFrom(path));
        return string;
    }

    public static String readFrom(Path path) throws IOException {

        byte[] byteArray = Files.readAllBytes(path);
        String string = new String(byteArray, Charset.defaultCharset());
        System.out.println(string);
        return string;
    }

    public static void writeTo(Path path, String string) throws IOException {
        byte[] byteArray = string.getBytes();
        Files.write(path, byteArray, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // ask joro!
    public static void fixEncoding(Path path) throws IOException {
        byte[] byteArray = Files.readAllBytes(path);
        String fixed = new String(byteArray, StandardCharsets.UTF_8);
        byte[] newByteArray = fixed.getBytes();
        Files.write(path, newByteArray, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static void greetMe(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Holla. It's Monday.");
                break;
            case TUESDAY:
                System.out.println("Alloha. It's Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Bonjour. It's Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Salut. It's Thursday.");
                break;
            case FRIDAY:
                System.out.println("Hello. It's Friday.");
                break;
            case SATURDAY:
                System.out.println("Hi. It's Saturday.");
                break;
            case SUNDAY:
                System.out.println("Bye. It's Sunday.");
                break;
        }
    }

    // ask joro about ..
    public static Path reduceFilePathInOneLine(Path path) {
        return path.normalize();
    }

    // ask how to check?
    public static boolean isLinkBroken(Path path) {

        boolean flag = false;
        int count = 0;
        File[] files = path.toFile().listFiles();
        List<File> directories = new ArrayList<File>(files.length);
        for (File file : files) {
            if (file.isDirectory()) {
                directories.add(file);
            } else if (Files.isSymbolicLink(Paths.get(path.toString() + "\\" + file.toString()))) {
                if (Files.notExists(Paths.get(path.toString() + "\\" + file.toString()))) {
                    count++;
                    System.out.println(count + "Bad Link(s)");
                    flag = true;
                } else {
                    continue;
                }
            }
        }

        for (File directory : directories) {
            isLinkBroken(Paths.get(path.toString() + "\\" + directory.toString()));
        }
        return flag;
    }

    public static void compress(Path filePath) throws IOException {
        String content = readFrom(filePath);
        String[] words = content.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        Integer i = 0;
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, i++);
            }
        }
        String compressedString = "";
        for (String word : words) {
            compressedString = compressedString + map.get(word).toString() + "~";
        }
        compressedString = compressedString.substring(0, compressedString.length() - 1);

        String newFilePath = filePath.toString();
        newFilePath = newFilePath + ".compressed";

        File file = new File(newFilePath);
        file.createNewFile();
        Path path = file.toPath();
        writeTo(path, compressedString);
    }

    @Override
    public String toString() {
        if (this instanceof Path) {
            String singleSlash = "\\";
            String doubleSlash = "\\\\";
            String newFilePath = this.toString();
            newFilePath = newFilePath.replace(singleSlash, doubleSlash);
            return newFilePath;
        } else {
            return super.toString();
        }
    }
    public static void main(String[] args) throws IOException {
        final Path filepath = Paths.get("E:\\Adii\\Documents\\CoreJava\\resources\\lost.s04e11.hdtv.xvid-2hd.srt");
        fixEncoding(filepath);

        greetMe(Day.MONDAY);

        Path path = Paths.get("E:\\Adii\\Documents\\..\\CoreJava");
        reduceFilePathInOneLine(path);
        System.out.println(path);

        Path otherPath = Paths.get("E:\\Adii\\Documents\\CoreJava\\notes\\wordCount.txt");
        compress(otherPath);
    }
}
