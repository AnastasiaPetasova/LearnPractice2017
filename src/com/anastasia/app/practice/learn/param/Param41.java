package com.anastasia.app.practice.learn.param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Anastasia on 13.07.2017.
 */
public  class Param41 {

    /**
     * Split("aba abc- -def-", "- ") returns { "aba", "abc", "def"}
     * @param s
     * @param delimiters
     * @return
     */
    public static String[] split(String s, String delimiters) {
        List<String> myList = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = 0; i <= ch.length; ++i) {
            if (i == ch.length || delimiters.indexOf(ch[i]) >= 0) {
                if (str.length() > 0) myList.add(str.toString());
                str = new StringBuilder();
            } else {
                str.append(ch[i]);
            }
        }

        return myList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Locale.setDefault(Locale.US);

        String s = scanner.nextLine();

        String[] words = split(s, " ");

        System.out.println(words.length);
        Arrays.stream(words).forEach(System.out::println);
    }
}
