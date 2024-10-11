import java.util.*;
public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean find(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }else if(root.data > val){
            return find(root.left, val);
        }else{
            return find(root.right, val);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            root = insert(root, a);
        }
        // inorder(root);   // the inorder traversal of bst will always provide the Op in ascending order
        System.out.print("Enter the value to find : ");
        int x = sc.nextInt();
        System.out.println(find(root, x));
    }
}
