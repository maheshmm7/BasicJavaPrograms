public class Swapping {
    public static void main(String[] args) {

        float first = 77.7f, second = 67.7f;

        System.out.println("Before swapping");
        System.out.println("First number is = " + first);
        System.out.println("Second number is = " + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swapping");
        System.out.println("First number is = " + first);
        System.out.println("Second number is = " + second);

    }
}
