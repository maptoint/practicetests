package types.primitive;

    /*

    What is the result?

    A. 10

    B. Compilation fails.

    C. 18

    D. Output is unpredicatable.

    E. 8

    */
public class Java009 {

    int a = 10;

    public static void main(String[] args) {
        new Java009().print();
    }

    public void print() {
        int a = 8;
        System.out.print(a + " ");
    }

}
