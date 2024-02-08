import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        double number;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();

        if (number < 0.0)
            System.out.println(number + " is a negative number.");
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");
        else
            System.out.println(number + " is 0.");
    }

}

