/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.mschmidt42.chetest;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println(Fibonacci.getFibonacci(5));
    }
}
