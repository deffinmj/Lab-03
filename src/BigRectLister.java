import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {

    public static ArrayList<Object> collectAll (Filter f, Object ...objects)
    {
        ArrayList<Object> objArray = new ArrayList<>();
        for(Object i: objects) {
            if (f.accept(i)) {
                objArray.add(i);
            }
        }
        return objArray;
    }

    public static void main (String[] args) {

        Filter filter = new BigRectangleFilter();
        ArrayList<Rectangle> filtered = (ArrayList<Rectangle>)(ArrayList<?>)collectAll(new BigRectangleFilter(),
                new Rectangle(1, 1),
                new Rectangle(2, 2),
                new Rectangle(3, 3),
                new Rectangle(4, 4),
                new Rectangle(5, 5),
                new Rectangle(6, 6),
                new Rectangle(7, 7),
                new Rectangle(2, 3),
                new Rectangle(1, 3),
                new Rectangle(1, 2));

        for(int i = 0; i < filtered.size(); i++) {
            Rectangle r = filtered.get(i);
            System.out.printf("Allowed rectangle width: %d height: %d\n", r.width, r.height);
        }

    }

}
