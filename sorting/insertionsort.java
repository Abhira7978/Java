package sorting;

public class insertionsort {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[]={7,8,3,1,2};

//insertion sort
        for(int i = 0;i<arr.length;i++){
            int current=arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;
           
                
        
          
            
        }
        printArray(arr);
    }
}





// Step-by-Step Algorithm

// Start

// Repeat steps 3–7 for i = 1 to n − 1
// (We start from the second element)

// Set current = arr[i]
// (Store the element to be inserted)

// Set j = i − 1

// Repeat while j ≥ 0 AND arr[j] > current

// Shift arr[j] to arr[j + 1]

// Decrease j by 1 ( j = j − 1 )

// Insert current at its correct position:

// arr[j + 1] = current


// Continue until all elements are inserted in sorted order

// Stop