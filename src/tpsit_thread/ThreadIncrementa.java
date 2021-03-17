package tpsit_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadIncrementa implements Runnable {

    Counter contatore = new Counter();
    
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            contatore.incrementa();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
