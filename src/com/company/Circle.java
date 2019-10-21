package com.company;
//Mahathi Athreya 3B

public class Circle {
    private double radius;

    public Circle() {
        double radius = 2;
    }
    public Circle(double r) {
        radius = r;
    }
    public double area() {
        double a = (radius)*(radius)*(Math.PI);
        return a;
    }

    public double circumference(){
        double c = (2)*(Math.PI)*(radius);
        return c;
    }

}


