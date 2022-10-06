public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i);
        }

        int j = 0;
        while (j < Integer.MAX_VALUE) {
            if (j % 10 == 0) {
                j++;
                continue;
            }
            if (j > 100) {
                break;
            }
            System.out.println(j);
            j++;
        }

        int k = 0;
        do {
            if (k % 10 == 0) {
                k++;
                continue;
            }
            if (k > 100) {
                break;
            }
            System.out.println(k);
            k++;
        } while (k < Integer.MAX_VALUE);
    }
}
