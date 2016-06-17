package types.primitive;

import java.util.Iterator;
import java.util.TreeSet;

/*

        What will be the output of the program?

        A. one two three four

        B. four three two one

        C. four one three two

        D. one two three four one

 */
public class Java050 {
    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }
    }

}
