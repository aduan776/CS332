import java.util.Iterator;

public class FilterIterator<E> implements Iterator<E>{
	Iterator<E> iter;
	
	public FilterIterator(Iterable<E> iter){
		this.iter = iter.iterator();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iter.hasNext();
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return iter.next();
	}
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
