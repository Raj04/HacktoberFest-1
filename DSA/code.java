//Problem link: https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //try to think of mountain array concept
        //where mid-1<target && mid>target so mid is the index to be inserted
        int low=0,high=nums.length-1, mid=(low+high)/2;
        while(low<=high){
             mid=(low+high)/2;
            
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
