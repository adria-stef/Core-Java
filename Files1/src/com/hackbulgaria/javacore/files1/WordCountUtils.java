package com.hackbulgaria.javacore.files1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCountUtils {

    public static WordCountResult wordCount(Path path) throws IOException {

        List<String> listOfLines = Files.readAllLines(path, Charset.defaultCharset());
        int lineCount = listOfLines.size();

        int wordCount = 0;
        int characterCount = 0;

        for (String line : listOfLines) {

            characterCount += line.length();

            String[] words = line.split("\\s");
            wordCount += words.length;
        }

        characterCount += listOfLines.size() - 1;

        return new WordCountResult(lineCount, wordCount, characterCount);

    }
}
