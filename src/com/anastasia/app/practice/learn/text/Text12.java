package com.anastasia.app.practice.learn.text;

import com.anastasia.app.practice.learn.util.IOUtils;

import java.util.Scanner;

public class Text12 {

    private static void process(String fileName, String str){
        IOUtils.changeFileLines(fileName, line -> {
            if (line.isEmpty()) return str;
            return line;
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        String str = scanner.next();

        process(fileName, str);
    }
}
