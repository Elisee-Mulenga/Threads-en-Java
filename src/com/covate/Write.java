package com.covate;

import static java.lang.Thread.sleep;

/*public class Write extends Thread{}*/
public class Write implements Runnable {
    private String texte;
    private int nbre;
    private long attente;

    public Write(String texte, int nbre, long attente){
        this.texte = texte;
        this.nbre = nbre;
        this.attente = attente;
    }
    public void run(){
        try {
            for (int i=0; i<nbre; i++)
            {
                System.out.print(texte);
                    sleep(attente);
            }
        } catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }
}
