package chess;

import java.awt.*;

public class Piece {
    private Color color;
    private int loyalty;
    //south pieces
    public static final int sPAWN = 1;
    public static final int sKNIGHT = 2;
    public static final int sBISHOP = 3;
    public static final int sROOK = 4;
    public static final int sQUEEN = 5;
    public static final int sKING = 6;
    //north pieces
    public static final int nPAWN = -1;
    public static final int nKNIGHT = -2;
    public static final int nBISHOP = -3;
    public static final int nROOK = -4;
    public static final int nQUEEN = -5;
    public static final int nKING = -6;
    
    Piece(Color _color) 
    {
        color = _color;
    }

    Color getColor()
    {
        return (color);
    }
    void setColor(Color _color)
    {
        color = _color;
    }    
    
    void draw(Graphics2D g,int xleft,int ytop,int width,int height)
    {
        
    }
    
}
