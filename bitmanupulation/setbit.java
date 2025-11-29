package bitmanupulation;

public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos=4;
        int bitMask=1<<pos;

        int newbit= bitMask|n;
        System.out.println(newbit);

    }
    
}
