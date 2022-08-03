import java.util.Scanner;

public class linecomparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of line XY");
        System.out.println("x1 coordinate");
        int x1 = sc.nextInt();
        System.out.println("y1 coordinate");
        int y1 = sc.nextInt();
        System.out.println("x2 coordinate");
        int x2 = sc.nextInt();
        System.out.println("y2 coordinate");
        int y2 = sc.nextInt();

        double lineLengthXY = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line XY is => " + lineLengthXY);

        System.out.println("Enter the value of line AB");
        System.out.println("x1 coordinate");
        int a1 = sc.nextInt();
        System.out.println("y1 coordinate");
        int b1 = sc.nextInt();
        System.out.println("x2 coordinate");
        int a2 = sc.nextInt();
        System.out.println("y2 coordinate");
        int b2 = sc.nextInt();

        double lineLengthAB = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        String l1 = String.valueOf(lineLengthXY);
        String l2 = String.valueOf(lineLengthAB);
        int i = l1.compareTo(l2);

        if (i == 0) {
            System.out.println("Both lines are Equal");
        } else if (i > 0) {
            System.out.println("Line XY is Greater than line AB");
        } else {
            System.out.println("Line XY is Smaller than line AB");
        }
    }
}