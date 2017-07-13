package com.anastasia.app.practice.learn.text;

import com.anastasia.app.practice.learn.util.IOUtils;

import java.util.Scanner;

public class Text51 {

    private static void process(String fileName, char delimiter, int columns){
        for (int column = 0; column < columns; ++column) {
            String newFileName = column + "-" + fileName;

            int finalColumn = column;
            IOUtils.fileToFileWithTransform(fileName, newFileName, line -> {
                String[] parts = line.split("" + delimiter);
                return parts[finalColumn];
            });
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        char delimiter = ' ';
        int columns = 3;

        process(fileName, delimiter, columns);
    }
}
