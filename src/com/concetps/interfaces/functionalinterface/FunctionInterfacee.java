package com.concetps.interfaces.functionalinterface;
@FunctionalInterface
public interface FunctionInterfacee {
    public String greet(String name);
    static void method1() {
        System.out.println("Static method in interface");
    }
    default void method2() {
        System.out.println("Default method in interface");
    }

}
