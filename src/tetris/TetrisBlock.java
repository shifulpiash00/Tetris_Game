package tetris;

import java.awt.Color;
import java.util.Random;


public class TetrisBlock {   
    private GameArea ga;
    private int[][] shape;
    private Color color;
    private int  x , y;
    private int[][][] shapes;
    private int currentRotation ;
    private Color[] availableColors = {new Color(255,255,153),new Color(210,199,199)} ;
    private Color[] powerUpColor = {new Color(153,255,51), Color.ORANGE , Color.RED};

    public TetrisBlock(int[][] shape ){
        this.shape = shape;
        //this.color = color;
        initShapes();
    }
    
    private void initShapes(){
        shapes = new int[4][][];
        
        for(int i = 0;i < 4;i++){
            int r = shape[0].length;
            int c = shape.length;
            
            shapes[i] = new int [r][c];
            
            for(int y = 0;y<r;y++){
                for(int x = 0;x<c;x++){
                    shapes[i][y][x] = shape[c-x-1][y];
                }
            }
            shape = shapes[i];
        }
    }
    
    public void spawn(int gridWidth,int type){
        Random r = new Random(); 
        currentRotation = 0;
        shape = shapes[currentRotation];   
        y = -getHeight();
        x = r.nextInt(gridWidth - getWidth()) ;
        
        if(type == 1){
            color = powerUpColor[0];
        }
        else if(type == 2){
            color = powerUpColor[1];
        }
        else if(type == 3){
            color = powerUpColor[2];
        }
        else if(Mode.blakWhite || Mode.noPower){
            color = availableColors[1];
        }
        else
            color = availableColors[0];
    }
    
    //piash all from here to 
    public int[][] getShape(){
        return shape;
    }
    public Color getColor(){
        return color;
    }
    public int getHeight(){
        return shape.length;
    }
    public int getWidth(){
        return shape[0].length;
    }
      public int getX() {
        return x;
    }
    public void setX(int newX) {
        x = newX;
    }
      
      //here
    public int getY() {
        return y;
    }
    public void setY(int newY) {
        y = newY;
    }
    
    public void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
    public void rotate(){
        currentRotation++;
        if(currentRotation > 3){
            currentRotation = 0;
        }
        shape = shapes[currentRotation];
    }
    
    public int getBottomEdge(){
        return y + getHeight();
    }
    public int getRightEdge(){
        return x+getWidth();
    }
    public int getLeftEdge(){
        return x;
    }    
}