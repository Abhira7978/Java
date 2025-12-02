package reccursion;

import java.util.Scanner;

public class sumofnNo {
    public static void sumofNNumbers(int i,int n,int sum) {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
            
        }
        sum +=i;
        sumofNNumbers(i+1, n, sum);

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sumofNNumbers(1, n, 0);
    }
    
}
