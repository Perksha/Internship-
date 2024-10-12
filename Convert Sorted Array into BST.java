class Solution {
    public TreeNode helper(int[] num,int st,int en){
        if(st>en) return null;
        int mid=(st+en)/2;
        TreeNode root=new TreeNode(num[mid]);
        root.left=helper(num,st,mid-1);
        root.right=helper(num,mid+1,en);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
        
    }
}
