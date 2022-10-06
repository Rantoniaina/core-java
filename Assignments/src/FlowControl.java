public class FlowControl {
    public static void main(String[] args) {
        boolean primeFlag = true;

        for (int n = 11, i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                primeFlag = false;
            }
        }

        if (primeFlag) {
            System.out.println("Prime no");
        } else {
            System.out.println("Not a Prime no");
        }
    }
}
