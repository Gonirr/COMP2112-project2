public class Request {
    int urgency;
    private String catagory;
    int catId;
    String location;
    int createdDate;
    String status;
    private String requestID;
    private String ID;

    Request(String catagory,String location,String status,int createdDate,int urgency,int catID,int cnt){
        this.catagory=catagory;
        generateID(cnt);
        this.urgency=urgency;
        this.status=status;
        this.location=location;
        this.createdDate=createdDate;
        this.catId=catID;
    }

    private void generateID(int cnt){
        ID=""+cnt;
        while(ID.length()!=4){
            ID=0+ID;
        }
        requestID=catagory+"-"+ID;
    }
    
    @Override
    public int hashCode(){
        return getRequestIDasInteger()%10;
    }
    public int getRequestIDasInteger(){
        String s=catId+ID;
        /*
        for example assume cnt=1
        if the request is IT then catID=0
        then method returns 00001
        if the request is FAC then catID=1
        then method returns 10001
        */
        return Integer.parseInt(s);
    }
    public void print(){
        System.out.println(this.requestID+" "+this.getRequestIDasInteger());
    }
}
