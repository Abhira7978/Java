package reccursion;

import java.util.Scanner;

public class factorial {
    public static int calcFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact_nm1=calcFact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = calcFact(n);
        System.out.println(fact);

        
    }
    
}
