package sorting;

public class selectionsort {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //bubble sort
        int arr[]={7,8,3,1,2};

//selection
        for(int i = 0;i<arr.length-1;i++){
            int smallest=i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                
            }
            int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            
        }
        printArray(arr);
    }
    
}



// Algorithm: Bubble_Sort(arr)

// 1.Start

// 2.Input array arr of size n.

// 3.Repeat the following steps for each pass
// For i = 0 to n - 2
// (This loop controls the number of passes)

// 4.For each pass, compare adjacent elements
// For j = 0 to n - i - 2
// (Elements after n - i - 1 are already sorted)

// 5.If the current element is greater than the next element, then
// a. Swap arr[j] and arr[j + 1].

// 6.End inner loop (j loop)

// 7.End outer loop (i loop)

// 8.Output the sorted array.

//9. Stop