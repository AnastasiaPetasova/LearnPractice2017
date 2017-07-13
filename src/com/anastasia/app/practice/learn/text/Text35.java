package com.anastasia.app.practice.learn.text;

import java.util.Scanner;

public class Text35 {

    private static void process(String fileName, int width){
        IOUtils.changeFileLines(fileName, line -> {
            int delta = width - line.length();
            delta /= 2;
            if (line.length() % 2 == 1) delta++;

            StringBuilder lineBuilder = new StringBuilder(line);
            for (int i = 0; i < delta; i++) lineBuilder.append(" ");
            line = lineBuilder.reverse().toString();

            return line;
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        int width = 50;

        process(fileName, width);
    }
}
