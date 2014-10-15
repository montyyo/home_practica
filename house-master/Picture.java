/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */


public class Picture
{
    
    private Square window;
    private Square wall;
    private Triangle roof;
    private Circle paisaje;
    private Circle sun;
    private Person hombre;
    /**
     * Constructor for objects of class Picture
     */
    
    public Picture()
    {
  
     // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        paisaje = new Circle();
        paisaje.changeColor("green");
        paisaje.changeSize(1000);
        paisaje.moveHorizontal(-480);
        paisaje.makeVisible();
        paisaje.moveVertical(170);
        
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        
        
        
      
    }

    public void moveHombre()
    {
    hombre = new Person();
        hombre.moveHorizontal(-250);
        hombre.makeVisible();
        hombre.slowMoveHorizontal(110);
    }
    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void moveSun()
    {
        sun.slowMoveVertical(185);
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        paisaje.changeColor("black");
        sun.changeColor("black");
        //tambien podemos llamar al metodo setBlackAndWhite
    }
    
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
