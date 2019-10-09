package com.company;
/* Also included is the frog class, also with a constructor, methods and main().  You must add the following:
A jump() method.  The method takes an integer as an argument.  The frog will move this number of spaces up and to the right.  The method returns no value.
A visit() method.   The method takes another Frog as an argument.  The frog will move to the location of its friend for a visit.
Uncomment the code in main and the code should run.  The output should look like below.
Create a new frog named Frank.  Give him a location.  Have him jump twice.  Print him and then have him go visit Freddy.
 Print him again to show his updated location.
 */


public class Frog {
    private String name;
    private int xPos;
    private int yPos;

    public Frog(String n,int x, int y)		// constructor
    {
        name = n;
        xPos=x;
        yPos=y;
        int z = 1;
        int a = 1;
        System.out.println(name);
    }
    public void setPos(int x, int y)	// accessor methods
    {
        xPos = x;
        yPos = y;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public void moveWest()		// change the pos of the frog
    {
        xPos = xPos-1;
    }
    public void moveEast()
    {
        xPos = xPos + 1;
    }
    public void moveNorth()
    {
        yPos=yPos+1;
    }
     public void jump(int z) {
         xPos = xPos + z;
         yPos = yPos + z;
    }
    public void visit(Frog other) {
        this.xPos = other.xPos;
        this.yPos = other.yPos;

    }
    //TODO jump method move up and to the right
    //This method should take an integer argument.  This argument controls how many spaces
    // the frog will move both up and right.  Returns no value.

    //TODO visit method moves frog to the location of the friend frog
    // This method will take an argument of type Frog.  It will find the position of the
    // frog and move to this position.

    public void eatFly()
    {
        System.out.println("Yum");
    }
    public String toString()
    {
        String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
        return s;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frog f1 = new Frog("Freddy",3,4);	// create an instance of Frog
        f1.eatFly();						// call Frog methods
        f1.moveNorth();
        System.out.println(f1);

        Frog f2 = new Frog("Francine", -2,0);
        f2.eatFly();
        // TODO uncomment these to test new code.
        //f2.jump(2);
        //f1.visit(f2);
        System.out.println(f1);
        System.out.println(f2);

        /* Frog f3 */


        // make a new frog named Frank.  have him jump twice and then go visit Freddy.

    }

}

