package org.hackthetower.samples;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());
    }

    public String sayHello() {
        return "Hello world";
    }
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
