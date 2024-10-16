class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if(root==null){
            root=new TreeNode(val);
            return root;
        } 
               if(val>root.val){
                root.right=insertIntoBST(root.right,val);
               } 
               else if(val<root.val){
                root.left=insertIntoBST(root.left,val);
               }
               return root;
    }
}
