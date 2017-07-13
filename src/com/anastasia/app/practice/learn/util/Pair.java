package com.anastasia.app.practice.learn.util;

/**
 * Created by Anastasia on 13.07.2017.
 */
public class Pair implements Comparable<Pair>{
    public int index;
    public double value;

    public Pair(int index, double value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        int valueCmp = Double.compare(this.value, other.value);
        if(valueCmp != 0) return valueCmp;

        return Integer.compare(this.index, other.index);

    }
}
