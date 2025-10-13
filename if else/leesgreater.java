import java.util.Scanner;


public class leesgreater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number a:");
        int a =sc.nextInt();
        System.out.println("Enter The Number b:");
        int b =sc.nextInt();

        if (a==b) {
            System.out.println("Equal");
            
        } else {
            if (a>b) {
                System.out.println("A is Greater Than b");
                
            }else{
                System.out.println("b is greater than a");
            }
            
        }

    }

    
}
