class Solution {
    public int maxArea(int[] height) {

        int leftWall=0;
        int rightWall=height.length-1;
        int maxArea= 0;

        while(leftWall<rightWall){
            maxArea= Math.max(maxArea,Math.min(height[leftWall],height[rightWall])*(rightWall-leftWall));
            if(height[leftWall]<height[rightWall]){
                leftWall++;
            }else{
                rightWall--;
            }
        }
        return maxArea;

    }
}