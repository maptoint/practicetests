package oca;

/*

Which are true of the following code? (Choose all that apply)

A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.

B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.

C. Immediately after line 9, only one grasshopper objects are eligible for garbage collection.

D. Immediately after line 10, only one grasshopper objects are eligible for garbage collection.

E. Immediately after line 11, only one grasshopper objects are eligible for garbage collection.

F. The code compiles.

G. The code does not compiles.

*/

import java.util.*;
class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("gs1");
        Grasshopper two = new Grasshopper("gs2");
        one = two;
        two = null;
        one = null;
    }
    private String name;
}

public class JavaOCA010{}