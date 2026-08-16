package DS;
public class Request {
    int urgency;
    private String catagory;
    private int catId;
    String location;
    int createdDate;
    String status;
    private String requestID;
    private String ID;
    int[] keys;

    public Request(String catagory,String location,String status,int createdDate,int urgency,int catID,int cnt){
        this.catagory=catagory;
        generateID(cnt);
        this.urgency=urgency;
        this.status=status;
        this.location=location;
        this.createdDate=createdDate;
        this.catId=catID;
        keys=new int[3];
        keys[0]=urgency;
        keys[1]=createdDate;
        keys[2]=getRequestIDasInteger();
        requestID=catagory+"-"+ID;
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
        then method returns 00001=1
        if the request is FAC then catID=1
        then method returns 10001
        */
        return Integer.parseInt(s);
    }
    public String toString(){
        return requestID;
    }

    public int[] getKeys(){
        return keys;
    }

    public int getIDasInt(){
        return Integer.parseInt(ID);
    }

    public int getCatID(){
        return catId;
    }
    
    public int getUrgency(){
        return urgency;
    }

    public void setUrgency(int newUrgency){
        urgency=newUrgency;
        keys[0]=urgency;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public void setDate(String year,String month,String day){
        String date=year+month+day;
        createdDate=Integer.parseInt(date);
        keys[1]=createdDate;
    }
    
}
