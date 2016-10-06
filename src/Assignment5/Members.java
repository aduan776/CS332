import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Members {
	// Members is a mutable record of organization membership
	/* AF:	The representation is members where it is [] if no members
	 * 		[member] if not empty and a member joins
	 * 		[member, anotherMember] if another member joins and so forth
	 */
	// rep-inv: members != null && no duplicates in members

	List<String> members; // the representation
	
	public Members(){
		members = new ArrayList<String>();
	}
	
	public boolean repOk1(){
		return members != null;
	}
	
	public boolean repOk2(){
		Set<String> set = new HashSet<String>();
		for (String member : members)
			set.add(member);
		return set.size() == members.size();
	}
	
	// Post: 
	// person becomes a member, throw IllegalArgument if null passed in
	public void join(String person) {
		if(person == null)
			throw new IllegalArgumentException("Null person cannot be passed into join");		
		members.add(person);
	}

	// Post: 
	// person is no longer a member, throw IllegalArgument if null passed in
	public void leave(String person) {
		if(person == null)
			throw new IllegalArgumentException("Null person cannot be passed into leave");		
		members.remove(person);
	}

	//Post:
	//true/false if is member, if null throw IllegalArgument
	public boolean isMember(String person) {
		if (person == null)
			throw new IllegalArgumentException("Null person cannot be passed into isMember");
		return members.contains(person);
	}
}
