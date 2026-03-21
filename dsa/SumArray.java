import java.util.*;
public class SumArray {

  public static double sum(double[] numbers) {
    Scanner sc= new Scanner(System.in);
    float n = sc.nextInt();
    int number[]=new int[n];
    for(int i=0;i<n;i++){//we take this for loop for the againand again using of input tag in this
            number[i]=sc.nextInt();//i is to input the marks
        }
    for(int i =0;i<n;i++){
      float sum=number[i]+number[i+1];
    }
    System.out.println(sum);
    return 0.0;
  }
}
    
