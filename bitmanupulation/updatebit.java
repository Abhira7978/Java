package bitmanupulation;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int pos=1;

        int operation=sc.nextInt();
        int bitmask=1<<pos;

        if(operation==1){
            int newbitMask=bitmask|n;
            System.out.println(newbitMask);

        }
        else{
            int notBitmask=~(bitmask);
            int newbit=notBitmask&n;
            System.out.println(newbit);
        }
    }
    
}
