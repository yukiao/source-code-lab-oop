package com.yukiao.multi_threading;

public class WordProcessor implements Runnable {
    private String text;

    public WordProcessor(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        String words[] = this.text.split("\\s");
        WordCounter.addWordCount(words.length);
    }
}
