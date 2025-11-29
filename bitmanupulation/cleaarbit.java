package bitmanupulation;

public class cleaarbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int  bitMask=1<<pos;
        int notBitmask=~(bitMask);

        int newbitmask=notBitmask&n;
        System.out.println(newbitmask);
    }
    
}
