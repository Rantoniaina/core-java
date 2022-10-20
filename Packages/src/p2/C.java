package p2;

import p1.A;
import p1.p3.E;

public class C {
    public static void main(String[] args) {
        A.a1();
        A aObject = new A();
        aObject.a2();

        p1.B bObject = new p1.B();

        E eObject = new E();
        eObject.e1();
    }
}
