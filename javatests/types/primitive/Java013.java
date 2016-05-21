package types.primitive;

/*

What is the result?

A. 20

B. 22

C. Compilation fails.

D. 24

E. An exception is thrown at runtime.

 */

public class Java013 {
    public static void main(String args[]) {
        int x = 10;
        int y = new Java013().change(x);
        System.out.print(x + y);
    }
    int change(int x) {
        x = 12;
        return x;
    }
}
