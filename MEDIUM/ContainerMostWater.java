public class ContainerMostWater {
    // Time: O(n) Space: O(1)
    public static int maxArea(int[] height) {
        
        int n = height.length;
        int maxArea = 0;
        int left =0;        // pointer to track left maxheight
        int right = n-1;    // pointer to track right maxheight

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right-left;
            int area = width*minHeight;

            maxArea  = Math.max(maxArea, area);

            // move pointer of the smaller height
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
