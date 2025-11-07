package Strings;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First name");
        String Firstname = sc.next();
        System.out.println("Enter The Last name");
        String Lastname =sc.next();
        String Fullname = Firstname+" "+Lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());


        for(int i = 0;i<=Fullname.length();i++){
            System.out.print(Fullname.charAt(i));
        }

    }
    
}
