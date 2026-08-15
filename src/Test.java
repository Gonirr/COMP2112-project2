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
        BSTNode <String> a =new BSTNode<>("a",1,0,0);
        BSTNode <String> b =new BSTNode<>("b",2,0,0);
        BSTNode <String> c =new BSTNode<>("c",3,0,0);
        BSTNode <String> d =new BSTNode<>("d",4,0,0);
        BSTNode <String> e =new BSTNode<>("e",5,0,0);
        BSTNode <String> f =new BSTNode<>("f",6,0,0);

        bst.insert(c);
        bst.insert(e);
        bst.insert(d);
        bst.insert(f);

        System.out.println(bst);
        System.out.println();
        bst.delete(c);
        System.out.println(bst);
    }
}
