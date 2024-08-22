class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        double median;
        int[] merged=new int[n];
        for(int i=0;i<nums1.length;i++){
            merged[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merged[nums1.length+j]=nums2[j];
        }
        Arrays.sort(merged);
        if((merged.length%2)!=0){
            median=merged[(merged.length-1)/2];
        }
        else{
             median = (merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2.0;
        }
        return median;
    }
}