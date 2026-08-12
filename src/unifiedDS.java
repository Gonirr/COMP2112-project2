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
            LinearHash[i]=new Hash<>(10);
        }
    }

    public void insertRequest(int cat,int loc,int stat,String year,String month,String day,int urgency){
        //checks if the given data are valid if not abort insert
        //combine date
        String date=year+month+day;
        //create request
        Request rq =new Request(catagories[cat], locations[loc], stats[stat], Integer.parseInt(date), urgency,cat,catIDcnt[cat]++);
        //insert into bst
        bst.insert(bst.getRoot(),bst.createNode(rq, rq.urgency, rq.createdDate, rq.getRequestIDasInteger()));
        //insert into hash
        System.out.println(rq.hashCode());
        LinearHash[cat].insert(rq.hashCode(), rq);
    }

    public void delete(){}

    
}
