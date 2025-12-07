package reccursion;

import java.util.Scanner;

public class powerofx {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }
        int xPower=calcpower(x, n-1);
        int power=x*xPower;
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  x =  sc.nextInt();
        int n = sc.nextInt();
       int ans= calcpower(x, n);
       System.out.println(ans);
        
    }
    
}
