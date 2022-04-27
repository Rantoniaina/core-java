public class AllInOne {
    public static void main(String[] args) {
        int x = 100;
        String y = Integer.toString(x);

        // Deprecated use valueOf
        Integer b = new Integer(y);

        int z = b.intValue();

        // Deprecated use valueOf
        Integer c = new Integer(z);

        String d = c.toString();

        int e = Integer.parseInt(d);
    }
}
