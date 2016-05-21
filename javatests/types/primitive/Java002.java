package types.primitive;

/*

What is the result?

A. 123456

B. An exception could be thrown at runtime.

C. 654321

D. nothing

E. 65432

F. 12345

 */

public class Java002 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int i = a.length - 1;

        while (i >= 0) {
            System.out.print(a[i]);
            i--;
        }
    }

}
