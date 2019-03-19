import java.util.Scanner;

public class Be_Positive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short n = input.nextShort();
        float a[] = new float[n];
        int posInArr = 0;
        double halfOfArr = Math.ceil(n/2D);

        for (int i = 0 ; i < n ; i++){
            a[i] = input.nextFloat();
        }
        for (int x = -100 ; x <= 100; x++){
            if (x == 0){
                x++;
            }
            for (int i = 0 ; i < n ; i++) {
                a[i] = a[i] / x;
                if (a[i] > 0) {
                    posInArr++;
                }
            }
            if (posInArr >= halfOfArr) {
                System.out.println(x);
                break;
            }else{
                for (int i = 0 ; i < n ; i++) {
                    a[i] = a[i] * x;
                }
                posInArr = 0 ;
            }
        }
        if (posInArr < Math.ceil(n/2D)) {
            System.out.println(0);
        }
    }
}
