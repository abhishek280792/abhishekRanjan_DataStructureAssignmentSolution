package skewedBST;

public class ConvertBSTtoSkewed {
    static Main.Node previousNode = null;
    static Main.Node headNode = null;

    static void convertBSTtoSkewed(Main.Node root,int seq){
        if(root==null){
            return;
        }
        if(seq>0){
            convertBSTtoSkewed(root.right,seq);
        }else{
            convertBSTtoSkewed(root.left,seq);
        }

        Main.Node rightNode = root.right;
        Main.Node leftNode = root.left;

        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            previousNode = root;
        }
        else
        {
            previousNode.right = root;
            root.left = null;
            previousNode = root;
        }

        if (seq > 0)
        {
            convertBSTtoSkewed(leftNode,seq);
        }
        else
        {
            convertBSTtoSkewed(rightNode,seq);
        }
    }
    static void printRightSkewed(Main.Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.nodeData + " ");
        printRightSkewed(root.right);
    }
    public static void display(){
        printRightSkewed(headNode);
    }
}
