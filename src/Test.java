import DS.*;

public class Test {
    public static void main(String[] args) throws Exception {
        /* unifiedDS ds=new unifiedDS();
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 5);
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 4);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 3);
        ds.insertRequest(3, 0, 0, "6767", "09", "17", 2);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 3);
        ds.bst.printTree(ds.bst.getRoot()); */

        BST <String> bst=new BST<>();
        int[] keys=new int[3];
        keys[0]=8;
        keys[1]=0;
        keys[2]=0;
        BSTNode tmp=bst.createNode("d", keys);
        bst.insert(bst.getRoot(), bst.createNode("a", 2, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("b", 5, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("r", 6, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("f", 11, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("g", 10, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("t", 4, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("y", 12, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("h", -2, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("c", 3, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("e", -1, 0, 0));
        bst.insert(bst.getRoot(), tmp);
        //bst.delete(tmp);
        //System.out.println(bst.search(bst.getRoot(), "d", keys));
        System.out.println(bst);
    }
}
