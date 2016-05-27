package javatests.types.primitive;

/*

    What is the result?

    A) The output is "true" and MyStuff fulfills the Object.equals() contract.

    B) The output is "false" and MyStuff fulfills the Object.equals() contract.

    C) The output is "true" and MyStuff does NOT fulfill the Object.equals() contract.

    D) The output is "false" and MyStuff does NOT fulfill the Object.equals() contract

    E) Compilation fails


 */
public class Java017 {
    Java017(String n) { name = n; }
    String name;
    public static void main(String[] args) {
        Java017 m1 = new Java017("guitar");
        Java017 m2 = new Java017("tv");
        System.out.println(m2.equals(m1));
    }
    public boolean equals(Object o) {
        Java017 m = (Java017) o;
        if(m.name != null)
            return true;
        return false;
    }
}
