package skewedBST;

public class Main {
    public static void main(String[] args){

        Main tree = new Main();
        Node root = new Node();
        ConvertBSTtoSkewed convertBSTskewed = new ConvertBSTtoSkewed();
        root = tree.newNode(50);
        root.left = tree.newNode(30);
        root.right = tree.newNode(60);
        root.left.left = tree.newNode(10);
        root.right.left= tree.newNode(55);

        int seq = 0;
        ConvertBSTtoSkewed.convertBSTtoSkewed(root,seq);
        ConvertBSTtoSkewed.display();
    }

    static class Node{
        int nodeData;
        Node left,right;
    }

    static Node newNode(int nodeData) {
        Node tempNode = new Node();
        tempNode.nodeData = nodeData;
        tempNode.left = null;
        tempNode.right = null;
        return tempNode;
    }

}
