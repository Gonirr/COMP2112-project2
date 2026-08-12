public class Request {
    int urgency;
    private String catagory;
    int catId;
    String location;
    int createdDate;
    String status;
    private String requestID;
    private int ID;

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
        ID=(int)System.currentTimeMillis()%10000;
        requestID=catagory+"-"+ID;
    }

    public int hashcode(){
        return ID%10;
    }
}
