package Strings;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The First name");
        // String Firstname = sc.next();
        // System.out.println("Enter The Last name");
        // String Lastname =sc.next();
        // String Fullname = Firstname+" "+Lastname; // It Is To concatinate the strings
        // System.out.println(Fullname);
        // System.out.println(Fullname.length());//It is To find The Number Of Characters Pass In A Strings




        // for(int i = 0;i<=Fullname.length();i++){
        //     System.out.print(Fullname.charAt(i)); //It Is To return All The Index Of The String
        // }

        
Scanner sc = new Scanner(System.in);
String Sentence = sc.nextLine();

String name = Sentence.substring(4);
System.out.println(name);



    }
    
}







