Public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        int nums3[] = new  int[m+n];

        while (i < m && j < n){

            if(nums1[i] <= nums2[j]){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }

        // if some  elements are left in nums1 or nums2, append them to nums3
        while(i <m){
            nums3[k++] = nums1[i++];
        }
        while(j < n){
            nums3[k++] = nums2[j++];
        }

        // put all the elements from nums3 back to nums1
        for(int p=0; p< nums3.length; p++){
            nums1[p] = nums3[p];
        }


    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2,3,0,0,0}; int m = 3;
        int[] arr2 = {2, 4, 6}; int n =3;
    }
}