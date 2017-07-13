package com.anastasia.app.practice.learn.param;

import com.anastasia.app.practice.learn.util.Pair;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Anastasia on 13.07.2017.
 */
public  class Param12 {
    public static int[] sortedIndexes(double[] arr){
        Pair[] pairs = IntStream.range(0, arr.length)
                .mapToObj(index -> new Pair(index, arr[index]))
                .toArray(Pair[]::new);

        Arrays.sort(pairs);

        return Arrays.stream(pairs)
                .mapToInt(e -> e.index)
                .toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Locale.setDefault(Locale.US);

        int n = scanner.nextInt();
        double[] a = IntStream.range(0, n)
                .mapToDouble(i -> scanner.nextDouble())
                .toArray();

        int[] indexes = sortedIndexes(a);
        IntStream.of(indexes)
                .forEach(i -> System.out.print(i + 1 + " "));
    }
}
