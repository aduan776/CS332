import java.util.List;

public class Members1 {
    // Members is a mutable record of organization membership
    // AF: ??
    // rep-inv: members != null

    List<String> members;   // the representation

    //  Post: person becomes a member
    public void join (String person) { 
    	if (person ==null)
    		throw new NullPointerException();
    	else
    	members.add(person);
    	}

    //  Post: person is no longer a member
    public void leave(String person) { 
    	if(person==null)
    		throw new NullPointerException();
    	members.remove(person);
    	}
    
    public boolean isMember(String person){
    	if(person==null)
    		throw new NullPointerException();
    	return members.contains(person);
    }
    
    public boolean repOk1()
    {
    	return members!=null;
    }
 }

