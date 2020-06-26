
class Solution {
    public int removeDuplicates(int[] nums) {
        // 记录非重复元素个数
        int count = 0;
        for(int i=0; i<nums.length;i++ ){
            for (int j=i; j<nums.length;j++){
                if (nums[i] == nums[j]){
                    break;
                }
                if (j==nums.length-1){
                    count++;
                    System.out.print(nums[i]);
                }
            }
        }
        return count;
    }
}