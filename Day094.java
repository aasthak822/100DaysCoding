/* Tree traversal preorder 

Algorithm Preorder(tree)

Visit the root.
Traverse the left subtree, i.e., call Preorder(left->subtree)
Traverse the right subtree, i.e., call Preorder(right->subtree) 

SOLUTION */


class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree {
    
    Node root;
 
    BinaryTree() { root = null; }
   
    
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
       
        System.out.print(node.key + " ");
 
        
        printPreorder(node.left);
 
        
        printPreorder(node.right);
    }
 
    
    void printPreorder() { printPreorder(root); }
 
    
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder();
    }
}