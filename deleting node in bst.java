class Solution {
    public TreeNode find(TreeNode node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
         if(root.val<key){
            root.right=deleteNode(root.right,key);
         }
         else if(root.val>key){
            root.left=deleteNode(root.left,key);
         }else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }else{
                TreeNode insu=find(root.right);
                root.val=insu.val;
                root.right=deleteNode(root.right,insu.val);
            }
         }
         return root;
    }
}
