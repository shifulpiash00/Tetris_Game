package tetris;

import javax.swing.JOptionPane;

public class Tetris {
    private static GameForm gf;
    private static StartupForn sf;
    private static LeaderBoardForn lf;
    private static Credit cd;
    private static Instructions is;
    private static Mode md;
    public static boolean rgb = false;
    public static int lscore;
    //private static Mode mf;
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new GameForm().setVisible(true);
            gf = new GameForm();
            sf = new StartupForn();
            lf = new LeaderBoardForn();
            md = new Mode();
            //mf = new Mode();

            sf.setVisible(true);
            }
        });      
    }
    
    public static void showLeaderboard(){
        lf.setVisible(true);
    }
    
    public static void showCredit(){
        cd = new Credit();
        cd.setVisible(true);
    }
    
     public static void showIns(){
        is = new Instructions();
        is.setVisible(true);
    }
    
    public static void start(){
//        md.initModes();
        gf.setVisible(true);
        gf.startGame();
        gf.startGame1();
    }
    
    public static void showStartUp(){
        md.initModes();
        sf.setVisible(true);
    }
    
    public static void gameOver(){
        String playerName = JOptionPane.showInputDialog("Game Over ! \nPlease Enter the Name :");
        //System.out.println(playerName);
        gf.setVisible(false);
        lf.listPlayer(playerName,lscore);
    }
}
