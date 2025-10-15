package pettern;
import java.util.Scanner;

public class backrightangletriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
    
}

    

