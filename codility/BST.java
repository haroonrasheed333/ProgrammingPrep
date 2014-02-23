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



    public static void main(String[] args) {
        int[] A = {3,5,1,2,12,7,8,0,13,4,5};
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
        System.out.println("done");

     }


}
