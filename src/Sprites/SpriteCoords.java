package Sprites;


public class SpriteCoords {
    int count;   
    int columns;
    int offsetX; 
    int offsetY;
    int width;   
    int height;
    int cycleCount;
    
    SpriteCoords(int count, int columns, int offsetX, int offsetY, int width, int height, int cycleCount){
    	this.count     = count;
        this.columns   = columns;
        this.offsetX   = offsetX;
        this.offsetY   = offsetY;
        this.width     = width;
        this.height    = height;
        this.cycleCount = cycleCount;
    }
}
