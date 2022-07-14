package com.covate;

public class Main {
    public static void main(String[] args) {
        Write e1 = new Write("bonjour ", 10,5);
        Write e2 = new Write("Bonsoir ", 12,14);
        Write e3 = new Write("\n", 6,18);
        /* Avec la methode Thread*/
//        e1.start();
//        e2.start();
//        e3.start();
        /* Avec la methode runnable*/
        Thread t1 = new Thread(e1);
        t1.start();
        Thread t2 = new Thread(e2);
        t1.start();
        Thread t3 = new Thread(e3);
        t1.start();
    }
}

/**
 * il y a 4 treads dans ce programme à cause de la methode main
 * la methode run execute processus par processus alors on appelle la methode start qui execute simultanement
 * la methode start ne peut etre appelée une seule fois
 * la methode sleep est une methode static de la classe tread et elle peut etre appelé de n'importe où dans le programme
 * à defaut de la methode sleep, le programme fonctionnera mais avec certains problèmes liés à l'environnement
 * */