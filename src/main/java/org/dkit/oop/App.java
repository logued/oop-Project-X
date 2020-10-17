package org.dkit.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("An addition to the App.java source file");
        int total = sum( 2,3);
        System.out.println("Total = " + total);
    }

    public static int sum( int x, int y){
        return x + y;
    }
}
