public class SwitchDemo {
    public static void main(String[] args) {
        int x = 1;

        switch (x) {
            case 1:
            case 2:
                System.out.println("Commom logic");
                break;
            default:
                System.out.println("Default");
        }
    }
}
