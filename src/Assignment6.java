import java.util.ArrayList;
import java.util.Iterator;


public class Assignment6 implements Check<Integer>{
	
	static <E> Iterator<E> filter (Iterator<E> g, Check<E> x) throws NullPointerException
	{
		ArrayList<E> list = new ArrayList<E>();
		if(g==null)
			throw new NullPointerException();
		else
		{
			while(g.hasNext())
			{
				E tmp = g.next();
				if(x.checker(tmp))
				{
					list.add(tmp);
				}
			}
		}
		return new FilterIterator<E>(list);
	}

	@Override
	public boolean checker(Integer object) {
		return object%2==0;
	}
	
	
}

