class Solution {
    boolean isHeap(Node root) {
        if(!isCBT(root,0,countNodes(root))){
            return false;
        }
        return isHeapHelper(root);
    }
        

    boolean isHeapHelper(Node root){
        if(root == null){
            return true; 
        }
        
        if(root.left != null && root.left.data>root.data){
            return false;
        }
        if(root.right!=null && root.right.data>root.data){
            return false;
        }
        
        return isHeapHelper(root.left) && isHeapHelper(root.right);
    }
    
    boolean isCBT(Node root,int index, int totalCounts){
        if(root==null){
            return true;
        }
        if(index>=totalCounts){
            return false;
        }
        boolean left = isCBT(root.left, 2*index+1, totalCounts);
        boolean right = isCBT(root.right, 2*index+2, totalCounts);
        return (left&&right);
    }
    
    int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1+ countNodes(root.left)+ countNodes(root.right);
    }
}
