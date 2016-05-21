package types.primitive;

    /*

    What is the result?

    A. Java SE 6

    B. Java SE 7

    C. Java SE

    D. Java

    E. Compilation fails.

    */

public class Java014 {

    public static void main(String[] args) {
        String s = "Java";
        s.concat(" SE 6");
        s.replace('6', '7');
        System.out.print(s);
    }

}
