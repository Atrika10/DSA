public RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k =0;
        // count k
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                k++;
            }
        }
        
        int i=0; int j=nums.length-1;
        // move  the elements which is  equal to val to the back of the array
        while (i <= j){

            if(nums[j] == val){
                j --;
            }else if(nums[i] == val){
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }else{
            i++;
            }
        }

        return k;
    }
}

