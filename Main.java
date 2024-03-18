//My main class
import java.util.ArrayList;
import java.util.Collections;

public class Main
    {
    public static void main(String[] args)
        {
        ArrayList<Rectangle> rectangles = new ArrayList<>();// creates a new rectangle ArrayList
        rectangles.add(new Rectangle(5.0, 3.5, 2.0, 1.5));// adds new rectangle/s to the array, and sets their attributes.
        rectangles.add(new Rectangle(6.0, 2.7, 3.0, 1.2));
        rectangles.add(new Rectangle(3.3, 7.8, 1.5, 2.5));
        rectangles.add(new Rectangle(2.0, 9.0, 4.0, 3.0));

        System.out.println("Rectangles before they were sorted:");// prints a message before outputting the rectangles in the array.
        for(Rectangle rectangle : rectangles)
            {
            System.out.println(rectangle);
            }

        Collections.sort(rectangles, new RectangleComparator());// sorts the rectangles.

        System.out.println("\nAfter the rectangles were sorted:");// prints a message before outputting the sorted rectangles.
        for(Rectangle rectangle : rectangles) 
            {
            System.out.println(rectangle);
            }
        }
    }
