package types.primitive;

/*

        What will be the output of the program?

        A. abcd

        B. ABCD

        C. dccd

        D. dcba

 */
public class Java049 {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = a.toLowerCase();
        b.replace('a','d');
        b.replace('b','c');
        System.out.println(b);
    }
}
