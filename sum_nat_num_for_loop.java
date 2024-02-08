import java.util.Scanner;
public class sum_nat_num_for_loop {
    public static void main(String[] args) {
        int num, sum = 0;

        System.out.println("enter no.of natural number to add:");
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);

    }


}
