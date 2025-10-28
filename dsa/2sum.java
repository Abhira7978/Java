package dsa;

public class 2sum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] number = new int [n];

        for(int i =0;i<n;i++){
            number[i]=sc.nextInt();

        }

        int x = sc.nextInt();

        for(int i = 0;i<n;i++){
            if(number[i,i]==x){
                System.out.println(number[i,i]);
            }
        }
    }
}
