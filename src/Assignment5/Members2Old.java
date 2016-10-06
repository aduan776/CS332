import java.util.HashSet;
import java.util.List;

public class Members2 {
    // Members is a mutable record of organization membership
    // AF: ??
    // rep-inv: members!=null && no duplicates in members.  

    List<String> members;   // the representation

    //  Post: person becomes a member
    public void join (String person) { 
    	if (members == null || person==null)
    		throw new NullPointerException();
    	else if(!members.contains(person))
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
    
    public boolean repOk2()
    {
    	if (members!=null)
    	{
    		HashSet<String> memberSet = new HashSet<>();
    		for(String p : members) {
    		  if(!memberSet.add(p)) 
    			  return false;
    		}
    	}
    	else if(members == null)
    		return false;
    	
    	
    	return true;
    }
 }
