class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int nums1Pos=0;
        int nums2Pos=0;
        int mergedArrayPos=0;

        while(nums1Pos<nums1.length && nums2Pos<nums2.length){
            if(nums1[nums1Pos]<nums2[nums2Pos]){
                merged[mergedArrayPos++]=nums1[nums1Pos++];
            }else{
                merged[mergedArrayPos++]=nums2[nums2Pos++];
            }
        }

        while(nums1Pos<nums1.length){
            merged[mergedArrayPos++]=nums1[nums1Pos++];
        }

        while(nums2Pos<nums2.length){
            merged[mergedArrayPos++]=nums2[nums2Pos++];
        }


        if((nums1.length + nums2.length) %2==0){
            double first = merged[((nums1.length + nums2.length)/2) - 1];
            double second = merged[((nums1.length + nums2.length)/2)];
            return (first + second) / 2;
        }else{
            return (double) merged[((nums1.length + nums2.length)/2)];
        }
    }

}