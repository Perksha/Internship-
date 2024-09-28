class Solution {
    public static int calculate(int num){
         return String.valueOf(num).chars().map(Character::getNumericValue).sum();
                     
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=calculate(nums[i]);
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
}
