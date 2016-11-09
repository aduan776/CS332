import java.util.List;

public class Members {
    // Members is a mutable record of organization membership
    // AF: ??
    // rep-inv: ??

    List<String> members;   // the representation

    //  Post: person becomes a member
    public void join (String person) { 
    	members.add(person);
    	}

    //  Post: person is no longer a member
    public void leave(String person) { 
    	members.remove(person);
    	}
    
    public boolean isMember(String person){
    	if(person==null)
    		throw new NullPointerException();
    	return members.contains(person);
    }
 }
