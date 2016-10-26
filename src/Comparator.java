import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class Comparator<E> {
	HashSet<E> hashData = new HashSet<E>();
	TreeSet<E> treeData = new TreeSet<E>();
	
	public int compare(Integer a, Integer b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		return a.compareTo(b);
	}
	
	@SuppressWarnings("unchecked")
	public void createTreeSet(ArrayList<Integer> data){
		data = bubbleSort(data);
		for(int i = 0; i < data.size(); i++){
			addToTreeSet((E) data.get(i));
		}
	}
	
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> data) {	
		int n = data.size();
		
		  for (int x = 0; x < n; x++) {
		    for (int y = 0; y < n - 1; y++) {
		    	if(compare(data.get(y), data.get(y+1)) > 0){	    
			        Integer temp = data.get(y+1); 
			        data.set(y+1, data.get(y));		  
			        data.set(y, temp);
		      }

		    }
		  }
		  return data;
	}
	
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
