package com.foo;

public class OverloadTest {

    public static void add(Integer x, Integer y) {
        System.out.println("Integer");
    }
    
    public static void add(Object o, Object n) {
        System.out.println("Object");
    }
    
    public static void main(String[] args) {
        add(10, 15);
        Object o = 10;
        Object n = 15;
        add(o, n);
    }
}
