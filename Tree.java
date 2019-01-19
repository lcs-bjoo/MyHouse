/**
 * Creates an instance of a Tree.
 *
 * @author R. Gordon
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    
    private Square lowerBase;
    private Square upperBase;
    private Triangle leaves1;
    private Triangle leaves2;
    private Triangle leaves3;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        lowerBase = new Square();
        upperBase = new Square();
        
        leaves1 = new Triangle();
        leaves2 = new Triangle();
        leaves3 = new Triangle();
        
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        lowerBase.makeVisible();
        lowerBase.moveHorizontal(270);
        lowerBase.moveVertical(125);
        lowerBase.changeColor("black");
        // move the base to whereever the user specified
        lowerBase.moveHorizontal(x);
        lowerBase.moveVertical(y);
        
        upperBase.makeVisible();
        upperBase.moveHorizontal(270);
        upperBase.moveVertical(140);
        upperBase.changeColor("black");
        
        upperBase.moveHorizontal(x);
        upperBase.moveVertical(y);
        
        leaves1.makeVisible();
        leaves1.changeSize(25, 80);
        leaves1.moveVertical(135);
        leaves1.moveHorizontal(295);
        leaves1.changeColor("green");
        
        leaves1.moveHorizontal(x);
        leaves1.moveVertical(y);
        
        leaves2.makeVisible();
        leaves2.changeSize(25, 80);
        leaves2.moveVertical(125);
        leaves2.moveHorizontal(295);
        leaves2.changeColor("green");
        
        leaves2.moveHorizontal(x);
        leaves2.moveVertical(y);
        
        leaves3.makeVisible();
        leaves3.changeSize(25, 80);
        leaves3.moveVertical(115);
        leaves3.moveHorizontal(295);
        leaves3.changeColor("green");
        
        leaves3.moveHorizontal(x);
        leaves3.moveVertical(y);
        
        // translate the tree to the specified location
        
        
    }
    
}
