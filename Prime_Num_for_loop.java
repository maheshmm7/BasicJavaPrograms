public class Prime_Num_for_loop {
    public static void main(String[] args) {
        int num =29;
        boolean flag = false;

        for (int i=1;i<=num/2;++i){
            if (num%1==0){
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println(num+"is a prime number");
        else
            System.out.println(num+"is not prime number");
    }
}
