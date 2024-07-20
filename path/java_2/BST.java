public class BST {

    static class Node {
         int data;
         Node left;
         Node right;

         Node(int data){
            this.data= data;
         }

    }

    public static Node insert (Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //LeftSubtree
            root.left = insert(root.left, val);
        }else{
            //Right SubTree
            root.right = insert(root.right, val);
        }
        return root ;

    }


    public static void preorder(Node root) {

        if(root==null){
            return;
        }

        System.out.print(root.data+ " ");
        inorder(root.left);
        inorder(root.right);
    }



    public static void inorder(Node root) {

        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }



    

    public static void postorder(Node root) {

        if(root==null){
            return;
        }

        System.out.print(root.data+ " ");
        inorder(root.left);
        inorder(root.right);
    }


    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null ;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
            
        }
        preorder(root);
        System.out.println();
        
        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();
        
    }
    
    
}


// output
// 5 1 2 3 4 7 
// 1 2 3 4 5 7 
// 5 1 2 3 4 7 
