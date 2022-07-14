package com.covate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Interruption e1 = new Interruption("bonjour ", 10);
        Interruption e2 = new Interruption("Bonsoir ", 12);
        Interruption e3 = new Interruption("\n", 6);
        /* Avec la methode Thread*/
//        e1.start();
//        e2.start();
//        e3.start();
        /* Avec la methode runnable*/
//        Thread t1 = new Thread(e1);
//        t1.start();
//        Thread t2 = new Thread(e2);
//        t1.start();
//        Thread t3 = new Thread(e3);
//        t1.start();
//
//        sc.nextLine();
//        e1.interrupt();
//        System.out.println("***** PREMIERE INTERRUPTION ********");
//
//        sc.nextLine();
//        e2.interrupt();
//        e3.interrupt();
//        System.out.println("***** DEUXIEME INTERRUPTION ********");

        /* Avec la methode Daemon*/
        e1.setDaemon(true);e1.start();
        e2.setDaemon(true);e2.start();
        e3.setDaemon(true);e3.start();
        /* cette ligne rend le programme executable*/
        sc.nextLine();
    }
}

/**
 * il y a 4 treads dans ce programme à cause de la methode main
 * la methode run execute processus par processus alors on appelle la methode start qui execute simultanement
 * la methode start ne peut etre appelée une seule fois
 * la methode sleep est une methode static de la classe tread et elle peut etre appelé de n'importe où dans le programme
 * à defaut de la methode sleep, le programme fonctionnera mais avec certains problèmes liés à l'environnement
 * */