package types.primitive;

public class Java003 {

	/*
    
    What is the result?

    A. 0

    B. error

    C. Compilation fails

    D. An uncaught exception is thrown at runtime.

    E. No output

    */

    public static void main(String args[]) {
        int x = 0, y = 10;
        try {
            y /= x;
        }
        System.out.print("/ by 0");
        catch(Exception e){
            System.out.print("error");
        }
    }

}
