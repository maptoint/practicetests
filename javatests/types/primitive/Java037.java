/*

    What is the result?

    A) c x y g

    B) c g x y

    C) x c y g

    D) x y c g

    E) y x c g

    F) y c g x


 */
public class Java037 {
    Java037() {
        System.out.print("c ");
    }

    {
        System.out.print("y ");
    }

    public static void main(String[] args) {
        new Java037().go();
    }

    void go() {
        System.out.print("g ");
    }

    static {
        System.out.print("x ");
    }
}
