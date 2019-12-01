package com.foo;

interface Function2 {
    public void print();
}

class Closure {
    private int a = 2;
    Function2 bar;
    
    public Function2 print() {
        bar.print();
        return bar;
    }
    public Closure() {
        bar = new Function2() {
            @Override
            public void print() {
                System.out.println(a);
            }
        };
    }
    
}

class Closure2 {
    private int a = 3;
    Function2 bar;
    
    public Function2 print() {
        bar.print();
        return bar;
    }
    public Closure2() {
        bar = new Function2() {
            @Override
            public void print() {
                System.out.println(a);
            }
        };
    }
    
}

public class ClosureExample {
    public static void main(String[] args) {
        Closure c = new Closure();
        c.print();
        Closure2 c2 = new Closure2();
        c2.bar = c.bar;
        c2.print();
    }
}
