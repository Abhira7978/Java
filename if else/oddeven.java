import java.util.Scanner;

public class oddeven {
    public static void main(String a[]){
        System.out.println("Enter the Value Of X:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("Even");
        
        }else{
            System.out.println("odd");
        }
 }
    
}
