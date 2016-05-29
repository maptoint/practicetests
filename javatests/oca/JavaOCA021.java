package oca;

/**
 * @author bakaev
 */
public class JavaOCA021 {
    public static void main(String[] args) {
        Cat gavr1 = new Cat() {
            @Override
            public String getMood() {
                return "hi";
            }
        };
        Cat gavr2 = new Cat() {
            @Override
            public String getMood() {
                return "hi";
            }
        };
        System.out.println(gavr1.getClass().getName());
        System.out.println(gavr2.getClass().getName());
    }
}


class Cat {

    public String getMood() {
        return null;
    };
}

