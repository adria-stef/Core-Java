package com.hackbulgaria.javacore.files1;


public class WordCountResult {

    private int lineCount;
    private int wordCount;
    private int characterCount;

    public WordCountResult(int lines, int words, int characters) {
        super();
        this.lineCount = lines;
        this.wordCount = words;
        this.characterCount = characters;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
