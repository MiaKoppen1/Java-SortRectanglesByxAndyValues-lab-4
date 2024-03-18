// My Rectangle class.
public class Rectangle
    {
    double x, y, width, height;// the attributes for the rectangle/s.

    public Rectangle(double x, double y, double width, double height)// constructor so we can make a new rectangle.
        {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        }

    @Override
    public String toString()// this will output the rectangle/s to the screen in a string format.
        {
        return String.format("Rectangle[x=%.1f, y=%.1f, width=%.1f, height=%.1f]", x, y, width, height);
        }
    }
