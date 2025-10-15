package pettern;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
    
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
            


        }
        
    }
    
}
