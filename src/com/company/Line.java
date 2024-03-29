package com.company;
//Mahathi Athreya 3B

/*
 Implement a method distance() of type double that computes the length of the line using the
distance formula. You may find Math.pow() and Math.sqrt() helpful.
 Implement a method midpoint of type Point that finds the midpoint of the line. It should create
a new Point and return it.
 Implement a method sameLength() that takes another Line as an argument. It should return
true if the lines have the same length and false if they do not. It should call other methods in
your class and should compare the lines to see if the lengths are close. (return
Math.abs(d1-d2) &lt;= .001)
 */
public class Line {
    private Point end1;
    private Point end2;
    private Point midPoint;

    public Line(double x1, double y1, double x2, double y2)
    {
        end1 = new Point(x1,y1);
        end2 = new Point(x2,y2);

    }
    public Line()		// default constructor
    {
        end1 = new Point();
        end2 = new Point();
    }

    public double distance()
    {
        double a = Math.pow((end2.getX() - end1.getX()), 2);
        double b = Math.pow((end2.getY() - end1.getY()), 2);
        double c = Math.sqrt(a + b);

        return c;

    }
    public Point midpoint()
    {
        double d = (end1.getX() + end2.getX())/2;
        double e = (end1.getY() + end2.getY())/2;

        midPoint = new Point(d,e);
        return midPoint;
    }

    public boolean sameLength(Line otherLine)
    {
        double l1 = this.distance();
        double l2 = otherLine.distance();
        return Math.abs(l1-l2) <= .001;
    }

    public double slope() {
        double m;
        m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
        return m;

    }
    public String toString()
    {
        String s = "Line with endpoints " + end1 + " and " + end2;
        return s;
    }

    public boolean parallel(Line otherLine)
    {
        double m1 = this.slope();
        double m2 = otherLine.slope();

        //return m1==m2;
        //because of roundoff error, it is not recommended that you compare
        //two floats for equality, but that their difference is small
        return Math.abs(m1-m2)<=.0001;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Line l1 = new Line(-1,-3, 2,1);

        double m = l1.slope();
        System.out.println(l1);
        System.out.println("Slope = " + m);

        Line l2 = new Line(0,0,3,4);
        System.out.println(l2);
        System.out.println("Slope = " + l2.slope());
        System.out.println("Parallel? " + l1.parallel(l2));


        double dist = l1.distance();
        Point p1 = l1.midpoint();

        System.out.println("distance = " + dist);
        System.out.println("Midpoint = " + p1);

        System.out.println("distance = " + l2.distance());
        System.out.println("Same length? " + l1.sameLength(l2));

    }
    /*
    Line with endpoints (-1.0, -3.0) and (2.0, 1.0)
Slope = 1.3333333333333333
Line with endpoints (0.0, 0.0) and (3.0, 4.0)
Slope = 1.3333333333333333
Parallel? true
distance = 5.0
Midpoint = (0.5, -1.0)
distance = 5.0
Same length? true
     */
}