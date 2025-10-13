import java.util.*;

public class Age {
    public static void main(String a[]){
        System.out.println("Enter the age:5");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("not Adult");
        }
    }
    
}
