class Solution {
    public int removeDuplicates(int[] nums) {


        //2 Pointer Approach
        int p = 0 ;

        if(nums.length == 0)
        return 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != nums[p]){
            p++;
            nums[p] = nums[i];

            }

        }

        return p+1;
    }
}
