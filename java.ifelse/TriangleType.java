import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc1.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc1.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc1.nextInt();
        
        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}