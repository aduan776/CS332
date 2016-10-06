import java.util.ArrayList;
import java.util.List;

public class Members1 {
	// Members1 is a mutable record of organization membership
	/* AF:	The representation is members where it is [] if no members
	 * 		[member] if not empty and a member joins
	 * 		[member, anotherMember] if another member joins and so forth
	 */
	// rep-inv: members != null

	List<String> members; // the representation

	public Members1(){
		members = new ArrayList<String>();
	}
	
	public boolean repOk1(){
		return members != null;
	}
	
	public boolean repOk2(){
		// According to the slides, this repaired version has only one rep-inv
		return false;
	}
	
	// Post: person becomes a member
	public void join(String person) {
		if (!isMember(person))
		members.add(person);
	}

	// Post: person is no longer a member
	public void leave(String person) {
		members.remove(person);
	}
	
	public boolean isMember(String person) {
		if (person == null)
			throw new NullPointerException("Members1.isMember");
		return members.contains(person);
	}
}
