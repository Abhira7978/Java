import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;}
            
            return fact;

        }
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Value Of N:");
            int n = sc.nextInt();

        int fact = calculateFactorial(n);
        System.out.println("The Factorial Is "+fact);
        }
    }
    

