package oca;

/*

Which of the following lines can be inserted at line 11 to print true? (Choose all that apply)

A. System.out.println(test(i -> i == 5));

B. System.out.println(test(i -> {i == 5;}));

C. System.out.println(test((i) -> i == 5));

D. System.out.println(test((int i) -> i == 5);

E. System.out.println(test((int i) -> { return i == 5;}));

F. System.out.println(test((i) -> { return i == 5;}));

*/

import java.util.function.Predicate;

public class JavaOCA017 {
    public static void main(String[] args) {
        //INSERT CODE HERE
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}
