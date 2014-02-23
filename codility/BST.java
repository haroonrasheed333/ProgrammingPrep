package codility;

/**
 * Created by rahmanaicc on 2/22/14.
 */
public class BST {



    public static Tree ConstructBST(Tree root, int A){
        if (root == null) {
            root = new Tree(A);
            root.left = null;
            root.right = null;
        }
        else {
            if (A < root.value) {
                if (root.left != null)
                    ConstructBST(root.left, A);
                else
                    root.left = new Tree(A);
            }
            else if (A > root.value) {
                if (root.right != null)
                    ConstructBST(root.right, A);
                else
                    root.right = new Tree(A);
            }
        }

    return root;

    }

    public static void inOrderTraversal(Tree root) {
        if (root == null)
            System.out.println("Empty BST");
        else {
            if (root.left != null)
                inOrderTraversal(root.left);
            System.out.println(root.value);
            if (root.right != null)
                inOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Tree root) {
        if (root == null)
            System.out.println("Empty BST");
        else {
            if (root.left != null)
                postOrderTraversal(root.left);
            if (root.right != null)
                postOrderTraversal(root.right);
            System.out.println(root.value);
        }
    }

    public static void preOrderTraversal(Tree root) {
        if (root == null)
            System.out.println("Empty BST");
        else {
            System.out.println(root.value);
            if (root.left != null)
                preOrderTraversal(root.left);
            if (root.right != null)
                preOrderTraversal(root.right);
        }
    }

    public static boolean searchBST(Tree root, int k) {

        while (true) {
            if (root == null)
                return false;

            if (k == root.value)
                return true;

            if (k < root.value)
                root = root.left;
            else
                root = root.right;
        }
    }

    public static int findClosestValue(Tree root, int k) {



        int diff = 0;

        int closestVal = Integer.MIN_VALUE;

        if(root != null){
            diff = Math.abs(k-root.value);
            closestVal = root.value;
        }

        while (root != null) {


            if (k == root.value)
                return k;

            if (k < root.value)
            {
                int d = Math.abs(k-root.value);
                if(d <= diff){
                    diff = d;
                    closestVal = root.value;
                }
                root = root.left;

            }

            else{
                int d = Math.abs(k-root.value);
                if(d <= diff){
                    diff = d;
                    closestVal = root.value;
                }
                root = root.right;

            }

        }

        return closestVal;

    }

    public  static boolean verifyBST(Tree root,int min, int max ){

        if(root == null) return true;

        if(root.value < min  || root.value > max) return false;

        return verifyBST(root.left, min, root.value) && verifyBST(root.right, root.value + 1, max);

    }

    public static void DoubleTree(Tree root){
        if(root == null) System.out.print("I shouldnt be here");
        if(root.left != null)
            DoubleTree(root.left);
        //DoubleTree(root);
        if(root.right != null)
            DoubleTree(root.right);

        Tree temp = root.left;
        root.left = new Tree(root.value);
        root.left.left = temp;




    }

    public static int Size(Tree root){

        int size = 0;
        if(root == null) return  0;
        return Size(root.left) + 1 + Size(root.right) ;
    }

    public static int MaxDepth(Tree root){
        int left_size =  0;
        int right_size =  0;
        if(root == null) return 0;
        else{
            if(root.left != null) left_size = MaxDepth(root.left) ;
            if(root.right != null) right_size = MaxDepth(root.right) ;
        }
        return left_size > right_size ? left_size+1 :right_size+1;
    }

    public static int GetMaximum(Tree root){
        if (root == null) return Integer.MIN_VALUE;
        int left =  GetMaximum(root.left);
        int right = GetMaximum(root.right);
        return (root.value > left ) ? (root.value > right ) ? root.value : right : left;

    }

    public static int GetMinimum(Tree root){
        if (root == null) return Integer.MAX_VALUE;
        int left =  GetMinimum(root.left);
        int right = GetMinimum(root.right);
        return (root.value < left ) ? (root.value < right ) ? root.value : right : left;

    }



    public static int GetMinimumOfBST(Tree root){
        Tree curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return  curr.value;
    }

    public static int GetMaximumOfBST(Tree root){
        Tree curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        return  curr.value;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,12,7,8,0,13,4,5,-1};
        Tree root = null;
        for(int i = 0; i <A.length; i++) {
            root = BST.ConstructBST(root, A[i]);
        }
//
//        System.out.println("In");
//        BST.inOrderTraversal(root);
//        System.out.println("Post");
//        BST.postOrderTraversal(root);
//        System.out.println("Pre");
//        BST.preOrderTraversal(root);

        System.out.println(BST.searchBST(root, 3));
        System.out.println(BST.findClosestValue(root, 100));

        System.out.println(BST.verifyBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        //BST.DoubleTree(root);
        System.out.println(BST.Size(root));
        System.out.println(BST.MaxDepth(root));
        System.out.println(BST.GetMinimumOfBST(root));
        System.out.println(BST.GetMaximumOfBST(root));
        System.out.println(BST.GetMaximum(root));
        System.out.println(BST.GetMinimum(root));

        System.out.println("done");

     }






}
