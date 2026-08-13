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
        keys[0]=4;
        keys[1]=0;
        keys[2]=0;
        BSTNode tmp=bst.createNode("d", keys);
        bst.insert(bst.getRoot(), bst.createNode("a", 3, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("b", 5, 0, 0));
        bst.insert(bst.getRoot(), bst.createNode("c", 2, 0, 0));
        bst.insert(bst.getRoot(), tmp);
        bst.printTree(bst.getRoot());
        
        System.out.println(bst.search(bst.getRoot(),"d", keys));
        /* LinkedList <Integer> ll=new LinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertLast(3);
        ll.insertLast(4);
        System.out.println(ll); */
    }
}
