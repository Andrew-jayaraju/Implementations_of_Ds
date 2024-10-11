import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    static class Node{
         int data;
         Node left;
         Node right;
         Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
    }

    static class BinaryTreeimp{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }
    // Traversal
    // Preorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void leveltraversal(Node root){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0; i<size; i++){

                Node node = q.poll();
                res.add(node.data);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            arr.add(res);
        }
        int n = arr.size();
        int m = arr.get(0).size();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeimp tree = new BinaryTreeimp();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        leveltraversal(root);
    }
}
