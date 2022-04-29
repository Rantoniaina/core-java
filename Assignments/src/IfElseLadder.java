public class IfElseLadder {
    public static void main(String[] args) {
        double maths = 74.5, physics = 65, chemistry = 75.5;
        double minPass = 35, minGradeC = 59, minGradeB = 69;


        if (maths < minPass || physics < minPass || chemistry < minPass) {
            System.out.println("Exam failed");
        } else {
            double average = (maths + physics + chemistry) / 3;
            if (average <= minGradeC) {
                System.out.println("Grade C");
            } else if (average <= minGradeB) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade A");
            }
        }
    }
}
