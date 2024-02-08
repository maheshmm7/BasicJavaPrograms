import java.util.Scanner;
public class Calculator_switch_statement {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an Operator: +, -, *, /");
        operator = input.next().charAt(0);

        System.out.println("enter a number");
        number1 = input.nextDouble();

        System.out.println("enter second number:");
        number2=input.nextDouble();

        switch(operator){

            case '+':
                result=number1+number2;
                System.out.println(number1+"+"+number2+"="+result);
                break;
            case '-':
                result=number1-number2;
                System.out.println(number1+"-"+number2+"="+result);
                break;
            case '*':
                result=number1*number2;
                System.out.println(number1+"x"+number2+"="+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println(number1+"/"+number2+"="+result);
                break;
        }
        input.close();
        }
        }


