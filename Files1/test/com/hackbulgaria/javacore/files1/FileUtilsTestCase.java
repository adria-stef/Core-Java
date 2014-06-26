package com.hackbulgaria.javacore.files1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUtilsTestCase {

    private static final Path filePath = Paths.get("D:\\Adii\\Documents\\CoreJava\\notes\\random.txt");

    @Before
    public void setUp() throws Exception {
        filePath.toFile().createNewFile();
        final String contents = "randomwords";
        Files.write(filePath, contents.getBytes(Charset.defaultCharset()), StandardOpenOption.WRITE);
    }

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(filePath);
    }

    @Test
    public void testReadForm() throws IOException {
        assertEquals("randomwords", FileUtils.readFrom(filePath));
    }

    @Test
    public void testWriteTo() throws IOException {
        FileUtils.writeTo(filePath, "test");
        assertEquals("test", FileUtils.readFrom(filePath));
    }

}
