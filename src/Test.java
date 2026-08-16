import DS.*;
public class Test {
    public static void main(String[] args) throws Exception {
        unifiedDS ds=new unifiedDS();
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 3);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 5);
        ds.insertRequest(2, 0, 0, "6767", "09", "18", 5);
        ds.insertRequest(2, 1, 0, "6767", "09", "17", 2);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 3);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 4);

        ds.insertRequest(2, 0, 0, "5000", "09", "17", 3);
        ds.insertRequest(2, 0, 0, "5000", "09", "17", 4);
        ds.insertRequest(2, 0, 0, "5000", "09", "17", 1);
        ds.insertRequest(2, 0, 0, "5000", "09", "17", 2);
        ds.insertRequest(2, 0, 0, "5100", "09", "17", 1);

        ds.insertRequest(2, 0, 0, "2002", "09", "17", 1);
        ds.insertRequest(2, 0, 0, "2002", "09", "17", 2);
        ds.insertRequest(2, 0, 0, "2002", "08", "17", 1);
        ds.insertRequest(2, 0, 0, "2002", "09", "19", 2);
        ds.insertRequest(2, 0, 0, "2003", "09", "19", 2);
        Request rq=ds.searchByRequestID("FAC-0000");
        //System.out.println(ds.bst);
        ds.printOpenCases();
        //ds.findMostRelavent();
        //ds.updateUrgency("FAC-0000", 4);
        //ds.updateStatus(1, "FAC-0000");
        //ds.listByLoc(0);
        //System.out.println(ds.DSstats());
        //System.out.println(ds.LinearHash[2]);

        /* BST <String> bst=new BST<>();
        BSTNode <String> a =new BSTNode<>("a",1,0,0);
        BSTNode <String> b =new BSTNode<>("b",2,0,0);
        BSTNode <String> c =new BSTNode<>("c",3,0,0);
        BSTNode <String> d =new BSTNode<>("d",4,0,0);
        BSTNode <String> e =new BSTNode<>("e",5,0,0);
        BSTNode <String> f =new BSTNode<>("f",6,0,0);
        BSTNode <String> k =new BSTNode<>("k",7,0,0);
        bst.insert(d);
        bst.insert(b);
        bst.insert(c);
        bst.insert(a);
        bst.insert(f);
        bst.insert(e);
        bst.insert(k);
        System.out.println(bst);
        int h=bst.height(bst.getRoot());
        System.out.println(bst.findMostRight(bst.getRoot())); */

       /*  Hash <String> h=new Hash<>(3);
        h.insert(0, "a");
        h.insert(0, "b");
        h.insert(0, "d");
        h.insert(0, "c");
        System.out.println(h.delete(0, "d")); */
    }
}
