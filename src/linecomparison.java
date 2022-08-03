import java.util.Scanner;

public class linecomparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the x1 coordinate");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of the y1 coordinate");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of the x2 coordinate");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of the y2 coordinate");
        int y2 = sc.nextInt();

        double lineLength = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length of the line is => "+lineLength);
    }
}
