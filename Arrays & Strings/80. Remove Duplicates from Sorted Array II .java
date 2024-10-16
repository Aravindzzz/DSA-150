/*
Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
  */

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int current = nums[0];
        int count = 1;
        int k = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==current){
                if(count<2){
                    nums[k++]=current;
                    count+=1;
                }
            }
            else{
                current = nums[i];
                nums[k++] = current;
                count = 1;
            }
        }
        return k;
    }
 
}

Approch : if the count<2 , do not add the current element to the resultant array
  
