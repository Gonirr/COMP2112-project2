public class Test {
    public static void main(String[] args) throws Exception {
        unifiedDS ds=new unifiedDS();
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 5);
        ds.insertRequest(0, 0, 0, "6767", "09", "17", 4);
        ds.insertRequest(2, 0, 0, "6767", "09", "17", 5);
        ds.insertRequest(3, 0, 0, "6767", "09", "17", 5);
    }
}
