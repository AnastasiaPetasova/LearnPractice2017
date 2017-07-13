package com.anastasia.app.practice.learn.text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Text56 {

    private static void process(String fileName){
        boolean[] used = new boolean[Character.MAX_VALUE + 1];

        IOUtils.fileProcessing(fileName, line -> {
            line.chars().forEach(character -> used[character] = true);
        });

        String newFileName = "output-" + fileName;

        try (PrintWriter writer = new PrintWriter(newFileName)) {
            for (char character = Character.MAX_VALUE; ; --character) {
                if (used[character]) writer.print(character);
                if (character == 0) break;
            }

            writer.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        process(fileName);
    }
}
