import java.util.Scanner;

public class Multiplication {
    public static float calculateProduct(float a,float b){
        float mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        float a = sc.nextFloat();
        System.out.println("Enter The Second Number:");
        float b = sc.nextFloat();
        float mul = calculateProduct(a, b);

       

        System.out.println("The Multiplication of two number is -->"+ mul);
    }
    
}
