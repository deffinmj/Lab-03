import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle)x;
        if (2 * (r.width + r.height) > 10)
            return true;
        return false;
    }
}
