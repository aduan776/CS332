import java.util.ArrayList;
import java.util.Iterator;


public class Assignment6 {
	static Iterator<Integer> filter (Iterator<Integer> g, Check x) throws NullPointerException
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Check check = new Check();
		if(g==null)
			throw new NullPointerException();
		else
		{
			while(g.hasNext())
			{
				int tmp = g.next();
				if(check.checker(tmp))
				{
					list.add(tmp);
				}
			}
		}
		return list.iterator();
	}
			   //REQUIRES: g contains only Integers
			   //MODIFIES: g
			   //EFFECTS:
			   //If g is null throws NullPointerException else
			   //returns a generator that produces in order, each exactly once,
			   //all elements produced by for which checker(e) is true.

			//Here Check is a type whose objects have a method:

		

			

			//that determines whether its argument satisfies some predicate.

}
