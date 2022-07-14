package com.covate;

public class Interruption extends Thread {
    private String texte;
    private long attente;
    public Interruption(String texte, long attente){
        this.texte = texte;
        this.attente = attente;
    }

    public void run(){
        try {
            while (true){
                if (interrupted())
                    return;
                System.out.print(texte);
                sleep(attente);
            }
        }catch (InterruptedException e){
            return;
        }
    }

}
