package types.primitive;

/*

        What will be the output of the program?

        A. small

		B. tiny

	    C. huge

		D. Compilation fails

 */
public class Java051 {
    public static void main(String[] args) {
        int x = 20;
        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
        System.out.println(sup);
    }
}
