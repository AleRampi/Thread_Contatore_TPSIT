package tpsit_thread;

public class Counter {
    
    static int contatore = 0; //è static per creare una variabile condivisa.
    
    //Incrementa il contatore condiviso
    public void incrementa(){
        contatore++;
    }
    
    //Decrementa il contatore condiviso
    public void decrementa(){
        contatore--;
    }
    
    //Stampa il contatore condiviso
    public void stampaContatore(){
        System.out.println("contatore: " + contatore);
    }
    
}
