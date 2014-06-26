package com.hackbulgaria.javacore.files1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertiesFileParser {

    public PropertiesFileParser() {
        super();
    }

    public static Map<String, String> parseProperties(File propertiesFile) throws IOException {
        List<String> list;
        list = Files.readAllLines(propertiesFile.toPath(), Charset.defaultCharset());
        Map<String, String> map = new HashMap<>();
        map = helper(list);
        return map;
    }

    private static Map<String, String> helper(List<String> list) {

        Map<String, String> map = new HashMap<String, String>();
        for (String member : list) {
            if (!(member.substring(0, 1).equals("#"))) {
                // member = member.replaceAll("\\s{1,}", "");
                int index = member.indexOf('=');
                map.put(member.substring(0, index).trim(), member.substring(index + 1, member.length()));
            }
        }
        return map;
    }
}
