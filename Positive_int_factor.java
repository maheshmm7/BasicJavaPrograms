public class Positive_int_factor {
    public static void main(String[] args) {

        int number=60;

        System.out.println("factor of"+number+"are:");

        for (int i=1;i<=number;++i){
            if (number%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
