
/**
 * Creates an image of a house
 *
 * @BJoo
 * @version (Jan 11, 2019)
 */
public class MyHouse
{
    // fields aka
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    
    private Square base;
    private Triangle roof;
    private Square door1;
    private Square door2;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Circle doorknob;
    private Square grass;
    private Square sky;

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        door1 = new Square();
        door2 = new Square();
        window1 = new Square();
        window2 = new Square();
        window3 = new Square();
        window4 = new Square();
        doorknob = new Circle();
        grass = new Square();
        sky = new Square();
        
    }

    /**
     * Draws the House
  
     */
    public void drawHouse()
    {
        // Arrange each object
        // Set up the sun Ctrl Space
      
        
      
        grass.makeVisible();
        grass.changeColor("green");
        grass.changeSize(1000);
        grass.moveVertical(190);
        grass.moveHorizontal(-60);
        
        base.makeVisible();
        base.changeSize(150);
        base.moveVertical(100);
        base.changeColor("black");
        
        roof.makeVisible();
        roof.changeColor("red");
        roof.changeSize(50, 250);
        roof.moveVertical(100);
        roof.moveHorizontal(85);
        
        door1.makeVisible();
        door1.changeColor("white");
        door1.moveVertical(220);
        door1.moveHorizontal(20);
        
        door2.makeVisible();
        door2.changeColor("white");
        door2.moveVertical(200);
        door2.moveHorizontal(20);
        
        window1.makeVisible();
        window1.changeColor("white");
        window1.moveVertical(200);
        window1.moveHorizontal(70);
        
        window2.makeVisible();
        window2.changeColor("white");
        window2.moveVertical(160);
        window2.moveHorizontal(70);
        
        window3.makeVisible();
        window3.changeColor("white");
        window3.moveVertical(200);
        window3.moveHorizontal(110);
        
        window4.makeVisible();
        window4.changeColor("white");
        window4.moveVertical(160);
        window4.moveHorizontal(110);
        
        doorknob.makeVisible();
        doorknob.changeSize(10);
        doorknob.changeColor("yellow");
        doorknob.moveVertical(215);
        doorknob.moveHorizontal(75);
        
        
    
    }
}
