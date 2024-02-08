public class Alphabet_check {
    public static void main(String[] args) {
        char c = 'm';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

    }
}
