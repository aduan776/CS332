import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ClientClass {
	
	/*
	 * Collaboration Notes:
	 * Pyoung Kang Kim, Alex Duan and Daniel Quintero all talked about this homework in a group chat.
	 * Daniel and Alex helped come up with some of the client code after Pyoung wrote the anonymous
	 * class and its implementation. Pyoung wrote the brief summary explaining the main problem
	 * and also an additional problem with the code. Alex wrote this contribution and 
	 * Daniel and Alex  came up with the comments in this client code. Alex and Daniel
	 * revised the implementation of Pyoung's code to see if it was correct and we all tested to see
	 * if this submission fulfills its requirements. 
	 */

	public static void main(String[] args) {
		/*
		 * What is wrong with the code is the following. 
		 * 
		 * Direct violation of Contract for Comparator(Brief Summary for the Homework):
		 * From the JavaDocs, it says for a postcondition that compare method for Comparator "Returns a negative integer, zero, 
		 * or a positive integer as the first argument is less than, equal to, or greater than the second."
		 * This is also not true for our case because -1 is not equal to 1 but returns 0 for our compare method if o1 is -1 and o2 is 1.
		 * This is one violation of the contract in Comparator when using our implementation of the Comparator for our TreeSet.
		 * 
		 * Additional notes on some things that might make this TreeSet behave strange:
		 * From the JavaDocs: The ordering imposed by a comparator c on a set of elements S is said to be consistent 
		 * with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.
		 * Well our compare method does not keep that as compare(-1, 1)==0 for our compare method will return true while
		 * new Integer(-1).equals(new Integer(1)); will return false. The question now is that if it actually violates a contract somehow.
		 * It does, but not for Comparator like the first paragraph above. From the JavaDocs: It "violates the contract for 
		 * set(or map), which is defined in terms of equals"
		 * This is because unlike Sets, which acknowledges two elements to be equal by the 
		 * equals() method, TreeSets use the compare or compareTo method. 
		 */
		HashSet<Integer> hSet = new HashSet<Integer>();
		TreeSet<Integer> tSet = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return ((Integer) (Math.abs(o1))).compareTo(Math.abs(o2));
			}
		});
		hSet.add(-2); // AF(hSet) = [-2]
		hSet.add(-1); // AF(hSet) = [-2, -1]
		hSet.add(0); // AF(hSet) = [-2, -1, 0]
		hSet.add(1); // AF(hSet) = [-2, -1, 0, 1]
		hSet.add(2); // AF(hSet) = [-2, -1, 0, 1, 2]
		System.out.println(hSet); // prints [-2, -1, 0, 1, 2]
		
		tSet.add(-2); // AF(tSet) = [-2]
		tSet.add(-1); // AF(tSet) = [-1, -2]
		tSet.add(0); // AF(tSet) = [0, -1, -2]
		System.out.println(tSet.contains(1)); // should print false, but prints true
		// The line above is just another side effect from this "strangely" behaving set
		// Just wanted to put this here to explain why the below does not add 1 or 2 to the TreeSet
		tSet.add(1); // AF(tSet) = [0, -1, -2]
		tSet.add(2); // AF(tSet) = [0, -1, -2]
		System.out.println(tSet); // prints [0, -1, -2]
	}
}
