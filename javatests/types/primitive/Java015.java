package types.primitive;

/*

How many String objects have been created when the code reaches line 7?

A. 1

B. 2

C. 3

D. 4

E. 5

*/

public class Java015 {

    public static void main(String[] args) {
        String s = "Java";
        s.concat(" SE 6");
        s.toLowerCase();
        System.out.print(s);
        //how many?
    }

}
