package com.anastasia.app.practice.learn.param;

import com.anastasia.app.practice.learn.util.Point;
import com.anastasia.app.practice.learn.util.Triangle;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Anastasia on 13.07.2017.
 */
public  class Param70 {
    public static double polygonArea(Point[] points) {
        double area = 0;

        Point start = points[0];
        for (int i = 1, j = i + 1; j < points.length; i++, j++) {
            Point mid = points[i], end = points[j];
            Triangle triangle = new Triangle(start, mid, end);
            area += triangle.area();
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Locale.setDefault(Locale.US);

        int n = scanner.nextInt();
        Point[] points = IntStream.range(0, n)
                .mapToObj(i -> new Point(scanner.nextDouble(), scanner.nextDouble()))
                .toArray(Point[]::new);

        double area = polygonArea(points);
        System.out.println(area);
    }
}
