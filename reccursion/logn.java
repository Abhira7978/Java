package reccursion;

import java.util.Scanner;

public class logn {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }
        if(n%2==0){
            return calcpower(x, n/2)*calcpower(x, n/2);
        }else{
            return calcpower(x, n/2)*calcpower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  x =  sc.nextInt();
        int n = sc.nextInt();
       int ans= calcpower(x, n);
       System.out.println(ans);
        
    }
    
}
