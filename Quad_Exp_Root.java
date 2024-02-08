import java.util.Scanner;
public class Quad_Exp_Root {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Enter value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Enter value of b:");
        b = sc.nextDouble();
        System.out.println("Enter value of c:");
        c = sc.nextDouble();

        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);

        }
}
}
