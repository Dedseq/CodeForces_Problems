 import java.util.Scanner;
    public class Wrong_Subtraction {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            long n = input.nextLong();
            byte k = input.nextByte();
            for (int i = 0 ; i < k ; i++){
                if (n % 10 != 0){
                    n-= 1;
                }
                else n = n/10 ;
            }
            System.out.println(n);
        }
    }
