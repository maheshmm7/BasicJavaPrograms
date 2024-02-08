
import java.util.Scanner;
public class Area_of_rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter width of Rectangle:");
        double width = scanner.nextDouble();
        double area = length*width;
        System.out.println("The Area of Rectangle is for given length and width is :"+area);

    }
}

