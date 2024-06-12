public class BubbleSort {

    // Time Complexity of this function =>  O(n^2), where n = the size of the array
    public static int[] bubbleSort(int arr[]){

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){

        int arr[] = {5,7,1,4,3};
        int ans[] = bubbleSort(arr);

        // print ans
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    
}
