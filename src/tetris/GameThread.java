package tetris;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GameThread extends Thread{

    private int colorChange = 1;
    private GameArea ga;
    private GameForm gf;
    private Mode md;
    private int score = 0;
    private int level = 1;
    private int scorePerLevel = 3;



    public GameThread(GameArea ga , GameForm gf) {
        this.ga = ga;
        this.gf = gf;
        gf.updateScore(score);
        //gf.updateLevel(level);
    }

    @Override
    public void run(){
        while(true){
            ga.spawnBlock();
            while(ga.moveBlockDown()){
                try {
                Thread.sleep(md.speedupPerLevel);
                } catch (InterruptedException ex) {
                    return;
                }
            }
            if(ga.isBlockOutOfBounds())
            {
                Tetris.gameOver();
                break;
            }
            ga.moveBlockToBackground();
            score +=ga.clearLines();
            Tetris.lscore = score;
            gf.updateScore(score);
        }
    }
}