import java.util.Scanner;

public class BasicRevision {
    public static void floydsTriangle(int num){
        int k=1;
        for (int i = 0; i < num; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int nums[]){
        int i=0, j= nums.length-1;
        while (i<j) {
            // swap 2 elements
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
        printArray(nums);
    }

    // pairs in an array
    public static void pairsArr(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("(" + arr[i] +","+ arr[j]+ ")");
            }
        }
    }

    // print Subarrays , Print subarray sum, find min & max
    public static void printSubArray(int arr[]){
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
            if (max < arr[i]) {
                max =  arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }

            for(int j=i+1; j<arr.length; j++){

                int sum = 0;
                for (int k = i; k < j+1; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                System.out.print("sum = " + sum);
                if (max < sum) {
                    max =  sum;
                }
    
                if(min > sum){
                    min = sum;
                }

                System.out.println();
            }
        }
        System.out.println("max :" + max + " & min : " + min);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number: ");
        // int num = sc.nextInt();
        // floydsTriangle(num);
        int arr[] = {-1,2,3,-4};
        printSubArray(arr);
    }
}
