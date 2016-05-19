package oop;

    /*

    What will be printed out as a result of the following code execution / compilation?

    BCDA

    CDBA

    ABDC

    BCAD

    ABCD

    BACD

    CBAD

    CDBA

     */

class D extends C {
    private A objA = new A();
    private static B objB = new B();

    public D() {
        System.out.print("D");
    }

    public static void main(String[] args) {
        new D();
    }
}

class A {
    public A() {
        System.out.print("A");
    }
}

class B {
    public B() {
        System.out.print("B");
    }
}

class C {
    public C() {
        System.out.print("C");
    }
}
