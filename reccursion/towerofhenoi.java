package reccursion;

public class towerofhenoi {
    public static void towerOfHenoi(int n,String src,String helper,String Dest) {
        if(n==1){
            System.out.println("Transfer disk "+n+" From "+src+" To "+Dest);
            return ;
        }
        towerOfHenoi(n-1, src, Dest, helper);
        System.out.println("Transfer disk "+n+" From "+src+" To "+Dest);
        towerOfHenoi(n-1, helper,src, Dest);
        
    }
    public static void main(String[] args) {
        int n =3;
        towerOfHenoi(n, "S", "H", "D");
    }
    
}
