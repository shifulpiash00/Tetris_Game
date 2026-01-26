
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import org.w3c.dom.css.RGBColor;
import static tetris.Mode.*;
import tetrisblocks.*;


public class GameArea extends JPanel{  
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;
    private Color [][] background;
    private int colorChange = 0;
    public boolean s = true;
    public int cn = 0;
    public int retcn = 0;
    public int powerUpTime;
    public boolean powerUped;
    public int colpowerUpTime;
    public boolean colPowerUped;
    public int ultTime;
    public boolean ulted;
    public boolean rgb = false;
    private int[] powers = {5,10,15};
    public int highestGrid = 14;
    //public int bw
 
    private TetrisBlock block ; 
    private TetrisBlock[] blocks ;
    public GameThread gd;
    private Mode md;

    public GameArea(JPanel placeholder , int columns) {
        placeholder.setVisible(false);
        this.setBounds( placeholder.getBounds());
        this.setBorder( placeholder.getBorder());  
        
        gridColumns = columns;                                 // 10
        gridCellSize = this.getBounds().width / gridColumns;   // 200 / 10 = 20
        gridRows = this.getBounds().height / gridCellSize;     // 300/20 = 15
        
        md = new Mode();    
       
        blocks = new TetrisBlock[]{ new IShape(),
                                    new JShape(),
                                    new LShape(),
                                    new OShape(),
                                    new SShape(),
                                    new TShape(),
                                    new ZShape(),
                                    new RowPower(),
                                    new ColumnPower(),
                                    new Ult()
        };
    }
    
    public void initBackground(){
        background = new Color[gridRows][gridColumns];
    }
    public void initPowers(){
        powerUpTime = 0;
        powerUped = false;
        colpowerUpTime = 0;
        colPowerUped = false;
        ultTime = 0;
        ulted = false;
    }
    
    public void spawnBlock(){
        Random r = new Random();
        highestGrid = 14;
        if(  (ultTime != powers[2]  && powerUpTime != powers[0]  && colpowerUpTime!= powers[1]) || noPower ){
            block = blocks[ r.nextInt(7)];
            block.spawn(gridColumns,0);
        }
        if(!md.noPower){
            if(!md.pro){
                if(powerUpTime == powers[0]){
                powerUpTime = 0;
                if(colpowerUpTime != powers[1] && ultTime != powers[2]){  //colpowerUpTime != 8 && ultTime != 16
                    powerUped = true;
                    block = blocks[7];
                    block.spawn(gridColumns,1);
                    }
            }
            if(colpowerUpTime == powers[1]){
                colpowerUpTime = 0;
                if(ultTime != powers[2]){
                    block = blocks[8];
                    colPowerUped = true;
                    block.spawn(gridColumns,2);
                    }
                }
            if(ultTime == powers[2]){
                //System.out.println("ULT");
                block = blocks[9];
                ulted = true;
                colPowerUped = true;
                powerUped = true;
                ultTime = 0;
                block.spawn(gridColumns,3);
            }      
            }
            if(md.pro){
                if(powerUpTime == 2*powers[0]){
                powerUpTime = 0;
                if(colpowerUpTime != 2*powers[1] && ultTime != 2*powers[2]){  //colpowerUpTime != 8 && ultTime != 16
                    powerUped = true;
                    block = blocks[7];
                    block.spawn(gridColumns,1);
                    }
            }
            if(colpowerUpTime == 2*powers[1]){
                colpowerUpTime = 0;
                if(ultTime != 2*powers[2]){
                    block = blocks[8];
                    colPowerUped = true;
                    block.spawn(gridColumns,2);
                    }
                }
            if(ultTime == 2*powers[2]){
                //System.out.println("ULT");
                block = blocks[9];
                ulted = true;
                colPowerUped = true;
                powerUped = true;
                ultTime = 0;
                block.spawn(gridColumns,3);
            }
            }
        }
}  
   
//complete block
    private void drawBlock(Graphics g)
    {
        int h = block.getHeight() ;
        int w = block.getWidth() ;
        Color c = block.getColor();
        int[][] shape = block.getShape();

        for(int row = 0; row < h ;row++ )
        {
            for(int col = 0 ; col < w; col++)
            {
                if(shape[row][col] == 1)
                {
                    int x = (block.getX() + col) * gridCellSize;
                    int y = (block.getY() + row) * gridCellSize;                 
                
                    drawGridSquare(g,c,x,y);
                }               
            }
        }
    }
    
    public void colorChange(){
        //System.out.println(md.blakWhite);
        if(!md.blakWhite && !md.noPower){
            if(colorChange == 0)
            {
                this.setBackground(new Color(161,83,101));
                colorChange++;
            }
            else if(colorChange == 1)
            {
                this.setBackground(new Color(161,83,114));
                colorChange++;
            }
            else if(colorChange == 2)
            {
                this.setBackground(new Color(179,74,148));
                colorChange++;
            }
            
            else if(colorChange == 3)
            {
                this.setBackground(new Color(171,74,191));
                colorChange++;
            }
            else if(colorChange == 4)
            {
                this.setBackground(new Color(142,48,205));
                colorChange++;
            }
            else 
            {
                this.setBackground(new Color(116,48,205));
                colorChange++;
            }
            if(colorChange > 5)
                    colorChange = 0;
            }
        else{
            this.setBackground(Color.GRAY);
        }
    }
    
    private void drawBackground(Graphics g){
        //powerUpTime++;
        Color color;
        for(int r = 0;r < gridRows ; r++){
            for(int c = 0;c < gridColumns;c++){
                color = background[r][c];
                if(color != null){
                    int x = c * gridCellSize;
                    int y = r * gridCellSize;  
                    
                    drawGridSquare(g,color,x,y);
                }
            }
        }
    }
    
    private void drawGridSquare(Graphics g,Color color,int x,int y){
        g.setColor(color);   
        g.fillRect(x, y,gridCellSize , gridCellSize);
        g.setColor(Color.black);
        g.drawRect(x, y,gridCellSize , gridCellSize);
    }
    
    public boolean moveBlockDown(){       
        if(checkBottom() == false){
            powerUpTime++;
            colpowerUpTime++;
            ultTime++;
            return false;
        }
        
        block.moveDown();
        repaint();
        return true;
    }
    
    public void moveBlockRight(){
        if(!checkRight()){
            return;
        }
        block.moveRight();
        repaint();
    }
    
    public void moveBlockLeft(){
        if(!checkLeft()){
            return;
        }
        block.moveLeft();
        repaint();
    }
    public void dropBlock(){
        while(checkBottom()){
            block.moveDown();
        }
        repaint();
    }
    public void rotateBlock(){
        if( block == null)
            return;
        block.rotate();
        if(block.getLeftEdge() < 0)
            block.setX(0);
        
        if(block.getRightEdge() >= gridColumns)
            block.setX( gridColumns - block.getWidth());
         
        if(block.getBottomEdge() >= gridRows)
            block.setY( gridRows - block.getHeight() );
        repaint();
    }
    
    private boolean checkBottom(){
        if(block.getBottomEdge() == gridRows){
            return false;
        }
        
        int[][]shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();
        
        for(int col =0;col<w;col++){
            for(int row = h-1;row>=0;row--){
                if(shape[row][col]!=0){
                    int x = col + block.getX();
                    int y = row + block.getY() + 1;
                    if(y<0){
                        break;
                    }
                    if(background[y][x]!=null){
                        return false;
                    }
                    break;
                }
            }
        }        
        return true;
    }
    
    private boolean checkLeft(){
        if(block.getLeftEdge()==0){
            return false;
        }
        int[][]shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();
        
        for(int row =0;row < h;row++){
            for(int col = 0;col < w;col++){
                if(shape[row][col]!=0){
                    int x = col + block.getX() - 1;
                    int y = row + block.getY();
                    if(y<0){
                        break;
                    }
                    if(background[y][x]!=null){
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
    private boolean checkRight(){
        if(block.getRightEdge()>=gridColumns){
            return false;
        }
        
        int[][]shape = block.getShape();
        int w = block.getWidth();
        int h = block.getHeight();
        
        for(int row =0;row < h;row++){
            for(int col = w-1;col >= 0;col--){
                if(shape[row][col]!=0){
                    int x = col + block.getX() + 1;
                    int y = row + block.getY();
                    if(y<0){
                        break;
                    }
                    if(background[y][x]!=null){
                        return false;
                    }
                    break;
                }
            }
        }
        
        return true;
    }
    public void moveBlockToBackground(){
            int[][] shape = block.getShape();
            int h = block.getHeight();
            int w = block.getWidth();

            int xPos = block.getX();
            int yPos = block.getY();

            Color color = block.getColor();

            for(int r = 0;r < h;r++){
                for(int c = 0;c < w;c++){
                    if(shape[r][c] == 1){
                        background[r + yPos][c+xPos] = color;
                    }
                }
            }
    }
    
    public int clearLines()
    {
        boolean lineFilled = false;
        int linesCleared = 0;
        cn = 0;
        for ( int r = gridRows -1 ; r >= 0 ; r--)
        {
            if(!powerUped && !colPowerUped && !ulted){
                lineFilled = true ;             
                for( int c = 0; c < gridColumns ; c++)
                {
                    if(background[r][c] == null )
                    {
                        lineFilled = false;
                        break;
                    }
                }
            }
            if(powerUped){
                if(powerUped){
                    background[block.getY()][block.getX()] = null;
                    linesCleared+=clearLine(14);
                    shiftDown(14);
                    linesCleared+=clearLine(14);
                    shiftDown(14);
                    clearLine(0);
                    powerUped = false;
                    repaint();
                }
            }
            
            if(colPowerUped){
                background[block.getY()][block.getX()] = null;
                TraverseForm();
                linesCleared+=clearLine(highestGrid);
                if(highestGrid<14)
                {
                    System.out.println(highestGrid);
                    linesCleared+=clearLine(highestGrid + 1);
                }
                retcn += cn;
                colPowerUped = false;
                ulted = false;
                r++;
                repaint();
            }           
            if(lineFilled && !ulted && !colPowerUped && !powerUped){
                //linesCleared++;
                linesCleared+=clearLine(r);
                shiftDown(r);
                r++;
                repaint();
            }
    }  
    return linesCleared;
}
    private int clearLine(int r)
    {
        cn = 0;
        for ( int i = 0; i < gridColumns ; i++)
        {
            if(background[r][i] != null) cn++;
            background[r][i] = null;
        }
        return cn;
    }
    private void shiftDown(int r)
    {
        for( int row = r ; row > 0 ; row--)
        {
            for(int col = 0; col < gridColumns ; col++)
            {
                background[row][col] = background[row - 1][col] ;
            }
        }
    }
    
    public int TraverseForm(){
        int c = 0;
        for(int i = 14;i>=0;i--){
            for(int j = 0;j<=9;j++){
                if(background[i][j]!= null){
                    if(i<highestGrid)  highestGrid = i;
                }
            }
        }
        
        for(int i = 14;i>=0;i--){
            for(int j = 0;j<=9;j++){
                if(background[i][j]!= null && powerUped){
                    c++;
                }
            }
        }
        
        //System.out.println(highestGrid);
        return c;
    }
    
    public boolean isBlockOutOfBounds()
    {
        if(block.getY() < 0)
        {
            return true;
        }
        return false;
    }
     
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);  
        drawBackground(g);
        drawBlock(g);     
    }
}
