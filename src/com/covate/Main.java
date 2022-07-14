package com.covate;

public class Main {
    public static void main(String[] args) {
        Write e1 = new Write("bonjour", 10,5);
        Write e2 = new Write("Bonsoir", 12,14);
        Write e3 = new Write("\n", 6,18);
        e1.start();
        e2.start();
        e3.start();
    }
}