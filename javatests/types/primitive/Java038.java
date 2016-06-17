package types.primitive;

/*
    What is the result?

    A. Compiles and runs with no output

    B. Compiles and runs printing out The ageis 1

    C. Compiles bug generates a runtime error

    D. Does not compile

    E. Compiles bug generates a compile time error

 */
public class Java038 {
    static int age;

    public static void main(String[] args) {
        age = age + 1;
        System.out.println("The age is " + age);
    }
}
