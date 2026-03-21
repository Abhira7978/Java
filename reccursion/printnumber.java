

// public class printnumber {
//     public static void printNumb(int n) {
//         if (n==0) {
//             return;
//         }
//         // for(int i =5;i>0;i--){
//         //     System.out.println(i);
//         // }
//         System.out.println(n);
//         printNumb(n-1);
        
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n);
        
//     }
    
    
// }








// It is To Print The Number 1 To 5
public class printnumber {
    public static void printNumb(int n) {
        if (n==6) {
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
