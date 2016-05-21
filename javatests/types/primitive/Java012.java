package types.primitive;

    /*

    IMPORTANT: Ответ А. Классы нам особо не мешают, сам файл называется так же.

    What is the result?


    A. 1 John 25
       1 John 25

    B. 1 John 25
       1 John 22

    C. 1 John 22
       1 John 22

    D. ClassCastException is thrown at runtime.

    E. Compilation fails.

     */

class Person {

    static int pid;
    int age;
    String name;

    Person(String s, int i) {
        ++pid;
        name = s;
        age = i;
    }

}

class Test {

    public static void main(String args[]) {
        Person p1 = new Person("John", 22);
        Test te = new Test();
        Person p2 = te.change(p1);
        System.out.println(p2.pid + " " + p2.name + " " + p2.age);
        System.out.print(p1.pid + " " + p1.name + " " + p1.age);
    }

    private Person change(Object o) {
        Person p2 = (Person) o;
        p2.age = 25;
        return p2;
    }

}


