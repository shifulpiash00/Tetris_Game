
package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Coloring extends Thread{

    //private int colorChange = 1;
    private Mode md;
    private GameArea ga;
    boolean rgb = false;
    
    public Coloring(GameArea ga) {
        this.ga = ga;
    } 
    @Override
    public void run(){
      while(true){
                try {  
                ga.colorChange();    
                Thread.sleep(500);
                } catch (InterruptedException ex) {
                    return;
                }
            }
    }
}
