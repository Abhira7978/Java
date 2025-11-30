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



// step-by-Step Algorithm

// Start

// Repeat steps 3–7 for i = 0 to n − 2
// (This selects each position one by one)

// Set smallest = i
// (Assume current index has the smallest value)

// Repeat steps for j = i + 1 to n − 1
// (Search the smallest element in the remaining array)

// If arr[j] < arr[smallest]
// then set smallest = j
// (Found a new smaller element)

// After completing inner loop, swap

// temp = arr[smallest]
// arr[smallest] = arr[i]
// arr[i] = temp


// Continue until whole array is sorted

// Stop