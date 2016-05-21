package oca;

/*

What is the result of the following program?

A. 10

B. 15

C. 25

D. Compiler error on line 3.

E. Compiler error on line 8.

F. Non of th above.

*/
public class JavaOCA006{}

class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}
