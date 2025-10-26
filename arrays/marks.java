package arrays;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//it is to input the size of array

        int number[]=new int[n];

        for(int i=0;i<n;i++){//we take this for loop for the againand again using of input tag in this
            number[i]=sc.nextInt();//i is to input the marks
        }

        for(int i = 0;i<n;i++){
            System.out.println("The Marks are-->"+number[i]);//It is to print the marks
        }


    }
    
}
