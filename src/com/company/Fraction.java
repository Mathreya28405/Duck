package com.company;
/* 1) a default constructor.  A default constructor takes no arguments and sets appropriate default values for the attributes.
2) a toString() method so that we may print our fractions.  They should look like “3/4” when printed.
3) subtract() and multiply() methods.
4) Uncomment the code in main(), add a call to multiply the 2 fractions.  Your code should run.  The output should look like below.
3/4 + 4/5 = 31/20
3/4 - 4/5 = -1/20
3/4 * 4/5 = 12/20
5) Create 2 new fractions and add them together.  Display the results.
*/

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    //TODO default constructor (no arguments)

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()

    // TODO multiply()

    // TODO toString()


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);	// print the answer

		/*
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Add code to call multiply f1 and f2 here

		create 2 new fractions and add them here.

		*/


    }

}