import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Members2 {
	// Members2 is a mutable record of organization membership
	/* AF:	The representation is members where it is [] if no members
	 * 		[member] if not empty and a member joins
	 * 		[member, anotherMember] if another member joins and so forth
	 */
	// rep-inv: members != null && no duplicates in members

	List<String> members; // the representation
	
	public Members2(){
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

	// Post: person becomes a member
	public void join(String person) {
		if(person == null)
			throw new IllegalArgumentException("Null person cannot be passed into join");	
		if (!isMember(person))
		members.add(person);
	}

	// Post: person is no longer a member
	public void leave(String person) {
		if(person == null)
			throw new IllegalArgumentException("Null person cannot be passed into leave");
		members.remove(person);
	}
	
	public boolean isMember(String person) {
		if (person == null)
			throw new IllegalArgumentException("Null person cannot be passed into isMember");
		return members.contains(person);
	}
}
