import java.util.HashSet;
import java.util.TreeSet;


public class Comparator<E> {
	HashSet<E> hashData = new HashSet<E>();
	TreeSet<E> treeData = new TreeSet<E>();
	
	public boolean addToHashSet(E e)
	{
		return hashData.add(e);
	}
	public boolean addToTreeSet(E e)
	{
		return treeData.add(e);
	}
	public void removeFromHashSet(E e)
	{
		hashData.remove(e);
	}
	public void removeFromTreeSet(E e)
	{
		treeData.remove(e);
	}

}
