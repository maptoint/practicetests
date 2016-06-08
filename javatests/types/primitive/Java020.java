package javatests.types.primitive;

/*

    What is the result?

    A) cougar c c

    B) cougar c f

    C) feline cougar c c

    D) feline cougar c f

    E) Compilation fails

    F) An exception is thrown at run time.


 */
class Java20 {}

class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }
}
class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar ");
    }
    public static void main(String[] args) {
        new Cougar().go();
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
}
