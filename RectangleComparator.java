
import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle>// implementing the Comparator interface.
    {
    @Override
    public int compare(Rectangle r1, Rectangle r2) 
        {
        if (r1.x != r2.x) return Double.compare(r1.x, r2.x);// compares the x attributes.
        if (r1.y != r2.y) return Double.compare(r1.y, r2.y);// compares the y attributes.
        if (r1.width != r2.width) return Double.compare(r1.width, r2.width);// compares the width attributes.
        return Double.compare(r1.height, r2.height);// then, compares the height attributes.
        }
    }
