public class SelectionSort {

    // Time Complexity of this function =>  O(n^2), where n = the size of the array
    public static int[] selectionSort(int arr[]){

       for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;     // assume current elem is the min elem
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]){       //  we found smaller elem than current elem
                    minIdx = j;                 // update the minIdx
                }
            }

            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
       }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,1,4,3};
        int ans[] = selectionSort(arr);
        // print ans
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    
}
