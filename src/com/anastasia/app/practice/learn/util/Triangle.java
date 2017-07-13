package com.anastasia.app.practice.learn.util;

/**
 * Created by Anastasia on 13.07.2017.
 */
public class Triangle {

    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - a.distanceTo(b)))
                * Math.sqrt((halfPerimeter - b.distanceTo(c)) * (halfPerimeter - c.distanceTo(a)));
    }
}
