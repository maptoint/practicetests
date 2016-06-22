package types.primitive;

/*

        What will be the output of the program?

        A. ABC

	    B. abc

	    C. ABCdef

	    D. Compile Error

 */
public class Java055 {
    public static void main(String[] args) {

        String s = "ABC";
        s.toLowerCase();
        s += "def";
        System.out.println(s);
    }
}
