public class ShortWordFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        String y = (String)x;
        if (y.length()< 5)
            return true;
        return false;
    }
}
