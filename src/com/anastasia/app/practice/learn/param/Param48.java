package com.anastasia.app.practice.learn.param;

import com.anastasia.app.practice.learn.util.IOUtils;

import java.util.Scanner;

/**
 * Created by Anastasia on 13.07.2017.
 */
public  class Param48 {

    public static int intSize(String fileName) {
        int[] sum = { 0 };
        if (!IOUtils.fileProcessing(fileName, line -> {
            String[] parts = Param41.split(line, " ");
            sum[0] += parts.length;
        })) {
            return -1;
        }

        return sum[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        int intSize = intSize(fileName);
        System.out.println(intSize);
    }
}
