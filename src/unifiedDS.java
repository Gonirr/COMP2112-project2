import DS.*;

public class unifiedDS {
    String[] catagories={"IT","FAC","LIB","LAB","CLA","NET"};
    private static int[] catIDcnt;//used to generate unıque ıd for every catagory;
    String[] locations={"Building","Room","Lab","Office"};
    String[] stats={"OPEN","IN_PROGRESS","RESOLVED","CANCELLED"};
    Hash[] LinearHash;
    BST bst;

    unifiedDS(){
        LinearHash=new Hash[catagories.length];
        catIDcnt=new int[catagories.length];
        bst=new BST<>();
        for(int i=0;i<LinearHash.length;i++){
            LinearHash[i]=new Hash(10);
        }
    }

    public void insertRequest(int cat,int loc,int stat,String year,String month,String day,int urgency){
        //checks if the given data are valid if not abort insert
        //combine date
        String date=year+month+day;
        //create request
        Request rq =new Request(catagories[cat], locations[loc], stats[stat], Integer.parseInt(date), urgency,cat,catIDcnt[cat]++);
        //insert into bst
        bst.insert(new BSTNode(rq, rq.getKeys()));
        //insert into hash
        LinearHash[cat].insert(rq.hashCode(), rq);
    }

    public void delete(Request rq) throws Exception{
        BSTNode del=bst.search(bst.getRoot(), rq, rq.getKeys());
        if(bst.delete(del)){
            throw new Exception("Unable to delete data.");
        }
        if(LinearHash[rq.getCatID()].delete(rq.hashCode(), rq)){
            throw new Exception("Unable to delete data.");
        }
    }

    public Request searchByRequestID(String requestID){
        int place=0;
        int catID=0;
        String ID="";
        String cat="";
        for(int i=0;'-'!=requestID.charAt(i)||i<requestID.length();i++){
            cat=cat+requestID.charAt(i);
            place=i;
        }
        place++;
        for(int i=place;i<requestID.length();i++){
            if(catagories[i].equals(cat)){
                catID=i;
                break;
            }
        }
        if(!catagories[catID].equals(cat)){
            return null;
        }
        for(int i=0;i<requestID.length();i++){
            ID=ID+requestID.charAt(i);
        }
        int x=Integer.parseInt(ID);
        return LinearHash[catID].search(x);
    }


    

}
