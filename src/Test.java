import DS.*;
public class Test {
    public static void main(String[] args) throws Exception {
        /* unifiedDS ds=new unifiedDS();
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 5);
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 4);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 3);
        ds.insertRequest(3, 0, 0, "6767", "09", "17", 2);
        ds.bst.printTree(ds.bst.getRoot()); */

        BST <String> bst=new BST<>();
        bst.insert(bst.getRoot(), bst.createNode("a", 3, 2, 3));
        bst.insert(bst.getRoot(), bst.createNode("b", 3, 2, 4));
        bst.insert(bst.getRoot(), bst.createNode("c", 4, 2, 3));
        bst.insert(bst.getRoot(), bst.createNode("d", 2, 3, 4));
        bst.printTree(bst.getRoot());

        /* LinkedList <Integer> ll=new LinkedList<>();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertLast(3);
        ll.insertLast(4);
        System.out.println(ll); */
    }
}
