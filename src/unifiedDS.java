import DS.*;

public class unifiedDS {
    public String[] catagories={"IT","FAC","LIB","LAB","CLA","NET"};
    private static int[] catIDcnt;//used to generate unıque ıd for every catagory;
    String[] locations={"Building","Room","Lab","Office"};
    String[] stats={"OPEN","IN_PROGRESS","RESOLVED","CANCELLED"};
    Hash[] LinearHash;
    BST bst;
    int requestNum=0;

    unifiedDS(){
        LinearHash=new Hash[catagories.length];
        catIDcnt=new int[catagories.length];
        bst=new BST<>();
        for(int i=0;i<LinearHash.length;i++){
            LinearHash[i]=new Hash(10);
        }
    }

    public Request userCreatesRequest(int cat,int loc,int stat,String year,String month,String day,int urgency){
        if(!this.dateCheck(year, month, day)||!this.checkUrgency(urgency)) return null;
        //combine date
        String date=year+month+day;
        //create request
        Request rq =new Request(catagories[cat], locations[loc], stats[stat], Integer.parseInt(date), urgency,cat,catIDcnt[cat]++);
        return rq;
    }

    public void insertRequest(int cat,int loc,int stat,String year,String month,String day,int urgency){
        Request rq=this.userCreatesRequest(cat, loc, stat, year, month, day, urgency);
        insert(rq);
    }

    public void insert(Request rq){
        //insert into bst
        bst.insert(new BSTNode(rq, rq.getKeys()));
        //insert into hash
        LinearHash[rq.getCatID()].insert(rq.hashCode(), rq);
    }

    public void delete(Request rq){
        if(rq==null) return;
        BSTNode del=bst.search(bst.getRoot(), rq, rq.getKeys());
        if(del==null) return;
        bst.delete(del);
        LinearHash[rq.getCatID()].delete(rq.hashCode(), rq);
    }

    public void deleteRequest(String requestID){
        delete(searchByRequestID(requestID));
    }

    public Request searchByRequestID(String requestID){
        int place=0;
        int catID=0;
        String ID="";
        String cat="";
        for(int i=0;'-'!=requestID.charAt(i);i++){
            if(i==requestID.length()) break;
            cat=cat+requestID.charAt(i);
            place=i;
        }
        place++;
        for(int i=0;i<catagories.length;i++){
            if(catagories[i].equals(cat)){
                catID=i;
                break;
            }
        }
        if(!catagories[catID].equals(cat)){
            return null;
        }
        for(int i=place+1;i<requestID.length();i++){
            ID=ID+requestID.charAt(i);
        }
        int x=Integer.parseInt(ID);
        return LinearHash[catID].search(x);
    }

    public String LinearHashtoString(){
        String s="";
        for(int i=0;i<catagories.length;i++){
            s=s+this.catagories[i]+"\n"+LinearHash[i]+"\n";
        }
        return s;
    }
    
    public void updateUrgency(String requestID,int newUrgency){
        Request rq=this.searchByRequestID(requestID);
        if(!this.checkUrgency(newUrgency)||rq==null||rq.getUrgency()==newUrgency) return;
        delete(rq);
        rq.setUrgency(newUrgency);
        insert(rq);
    }

    public void updateDate(String requestID,String year,String month,String day){
        Request rq=this.searchByRequestID(requestID);
        if(!dateCheck(year, month, day)||rq==null) return;
        delete(rq);
        rq.setDate(year, month, day);
        insert(rq);
    }

    public boolean dateCheck(String year,String month,String day){
        //implement
        return true;
    }

    public boolean checkUrgency(int urgency){
        if(-1<urgency&&urgency<6){
            return true;
        }
        System.out.println("Invalid urgency.");
        return false;
    }

    public void updateStatus(int ix,String requestID){
        Request rq=this.searchByRequestID(requestID);
        if(rq==null||rq.getStatus().equals(this.catagories[ix])) return;
        rq.setStatus(this.stats[ix]);
    }

    public String DSstats(){
        int max=0;
        String s="Tree Height="+bst.height(bst.getRoot())+"\n";
        s=s+"Length of The Array Contianing Catogory Hashs="+LinearHash.length+"\n";
        for(int i=0;i<LinearHash.length;i++){
            if(LinearHash[i].maxChain()>max) max=LinearHash[i].maxChain();
            s=s+"Load Factor of "+catagories[i]+"="+LinearHash[i].loadFactor()+"\n";
        }
        s=s+"Max Length of A Catogory Hashs Chain="+max;
        return s;
    }

    public void printOpenCases(){
        printOpenCases(bst.getRoot());
    }

    private void printOpenCases(BSTNode focus){
        if(focus.getLeft()==null&&focus.getRight()==null) return;
        Request rq=(Request)focus.getData();
        if(rq.getStatus().equals(catagories[0])){
            System.out.println(rq);
        }
        printOpenCases(focus.getLeft());
        printOpenCases(focus.getRight());
    }

    private void findMostRelavent(BSTNode focus){
        Request rq=(Request) focus.getData();
        if(rq.getStatus().equals(catagories[0])){
            System.out.println(rq);
            return;
        }
        findMostRelavent(bst.searchParent(bst.getRoot(), focus, null));
    }

    public void findMostRelavent(){
        BSTNode n=bst.findMostRight(bst.getRoot());
        Request rq=(Request)n.getData();
        findMostRelavent(n);
    }
}
