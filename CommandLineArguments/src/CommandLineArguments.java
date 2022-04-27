public class CommandLineArguments {
    public static void main(String[] args) {
        int length = args.length;
        if (length == 0) {
            System.out.println("No Inputs Provided");
        } else {
            System.out.println("List of arguments");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
