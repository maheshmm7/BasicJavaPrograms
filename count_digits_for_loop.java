public class count_digits_for_loop {
    public static void main(String[] args) {
        int count =0, num = 0003457743642;

        while(num!=0){
            num/=10;
            ++count;
        }
        System.out.println("Number of digits:"+count);
    }
}
