import DS.Hash;

public class unifiedDS {
    String[] catagories={"IT","FAC","LIB","LAB","CLA","NET"};
    String[] locations={"Building","Room","Lab","Office"};
    String[] stats={"OPEN","IN_PROGRESS","RESOLVED","CANCELLED"};
    Hash[] LinearHash;

    unifiedDS(){
        LinearHash=new Hash[catagories.length];
        for(int i=0;i<LinearHash.length;i++){
            LinearHash[i]=new Hash(10);
        }
    }

    public void insertRequest(int cat,int loc,int stat,String year,String month,String day,int urgency){
        //checks if the given data are valid if not abort insert
        //combine date
        String date=year+month+day;
        //create request
        Request rq =new Request(catagories[cat], locations[loc], stats[stat], Integer.parseInt(date), urgency,cat);
        //insert into bst
        //insert into hash
        LinearHash[cat].insert(rq.hashCode(), rq);
    }
}
