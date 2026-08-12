public class Request {
    int urgency;
    private String catagory;
    int catId;
    String location;
    int createdDate;
    String status;
    private String requestID;
    private static int cnt=0;
    private String ID;

    Request(String catagory,String location,String status,int createdDate,int urgency,int catID){
        generateID();
        this.catagory=catagory;
        this.urgency=urgency;
        this.status=status;
        this.location=location;
        this.createdDate=createdDate;
        this.catId=catID;
    }

    private void generateID(){
        ID=""+cnt;
        while(ID.length()!=4){
            ID=0+ID;
        }
        requestID=catagory+"-"+ID;
    }

    public int hashcode(){
        return getRequestIDasInteger()%10;
    }
    public int getRequestIDasInteger(){
        String s=catId+ID;
        return Integer.parseInt(s);
    }
}
