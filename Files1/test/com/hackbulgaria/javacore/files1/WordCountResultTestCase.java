package com.hackbulgaria.javacore.files1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountResultTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IOException {
        Path path = Paths.get("E:\\Adii\\Documents\\CoreJava\\notes\\wordCount.txt");
        // WordCountResult wordCountResult = new WordCountResult(3, 4, 12);

        assertEquals(12, WordCountUtils.wordCount(path).getCharacterCount());
        assertEquals(3, WordCountUtils.wordCount(path).getLineCount());
        assertEquals(4, WordCountUtils.wordCount(path).getWordCount());

        // assertEquals(wordCountResult, WordCountUtils.wordCount(path));
    }

}
