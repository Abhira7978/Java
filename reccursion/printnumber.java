package reccursion;

public class printnumber {
    public static void printNumb(int n) {
        if (n==0) {
            return;
        }
        // for(int i =5;i>0;i--){
        //     System.out.println(i);
        // }
        System.out.println(n);
        printNumb(n+1);
        
    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
        
    }
    
}
