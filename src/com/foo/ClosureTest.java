package com.foo;

interface Function1 {
    public final Integer value = new Integer(0);

    public int apply();
}

class Closure1 implements Function1 {
    private Integer x = value;
    Function1 f;
    Function1 g;

    @Override
    public int apply() {
        // print('inside foo, call to f(): ' + f()); // "2"
        // inside apply, call to f.apply()
        System.out.println("inside foo, call to f.apply(): " + f.apply());
        return 0;
    }

    public Closure1() {
        f = new Function1() {
            @Override
            public int apply() {
                return x+1;
            }
        };
        g = new Function1() {
            @Override
            public int apply() {
                return x-1;
            }
        };
        // x = 1;
        x = 1;
    }
}

public class ClosureTest {
    public static void main(String[] args) {
        // foo()
        Closure1 foo = new Closure1();
        foo.apply();
        // print('call to g(): ' + g()); // "1"
        System.out.println("call to foo.g.apply(): " + foo.g.apply());
        // print('call to f(): ' + f()); // "2"
        System.out.println("call to foo.f.apply(): " + foo.f.apply());

    }
}
