class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] newarr=new int[nums.length];
        int p1=0;
        int p2=n;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                newarr[i]=nums[p1];
                p1++;
            }else{
                newarr[i]=nums[p2];
                p2++;
            }

        }

        return newarr;
    }
}