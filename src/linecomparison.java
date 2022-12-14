import java.util.Scanner;

public class linecomparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of line XY");
        System.out.print("x1 coordinate ->");
        int x1 = sc.nextInt();
        System.out.print("y1 coordinate ->");
        int y1 = sc.nextInt();
        System.out.print("x2 coordinate ->");
        int x2 = sc.nextInt();
        System.out.print("y2 coordinate ->");
        int y2 = sc.nextInt();
        double lineLengthXY = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line XY is => " + lineLengthXY);

        System.out.println("Enter the value of line AB");
        System.out.print("x1 coordinate ->");
        int a1 = sc.nextInt();
        System.out.print("y1 coordinate ->");
        int b1 = sc.nextInt();
        System.out.print("x2 coordinate ->");
        int a2 = sc.nextInt();
        System.out.print("y2 coordinate ->");
        int b2 = sc.nextInt();
        double lineLengthAB = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of the line AB is => " + lineLengthAB);

        Double lineOne = lineLengthXY;
        Double lineTwo = lineLengthAB;
        System.out.println(lineOne.equals(lineTwo));
        System.out.println(lineOne.compareTo(lineTwo));
    }
}