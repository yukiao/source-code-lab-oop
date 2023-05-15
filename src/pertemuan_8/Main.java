package com.yukiao.multi_threading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Texts.getWordCount());

        List<Thread> threads = new ArrayList<>();
        String[] texts = Texts.getTexts();

        for (String text : texts) {
            Thread thread = new Thread(new WordProcessor(text));
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
        }

        System.out.println("Total words: " + WordCounter.getWordCount());
    }
}
