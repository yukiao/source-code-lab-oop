package com.yukiao.multi_threading;

public class WordCounter {
    private static int wordCount = 0;

    public static synchronized void addWordCount(int count) {
        WordCounter.wordCount += count;
    }

    public static int getWordCount() {
        return WordCounter.wordCount;
    }
}
