package Minggu13;

public class BinaryTreeMain09 {
    public static void main(String[] args) {
        BinaryTree09 bt = new BinaryTree09();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("inOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("postOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find node: " + bt.find(5));
        System.out.println("Delete node 8 ");
        bt.delete(8);
        System.out.println("");

        System.out.print("PreOrde traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }        
}
