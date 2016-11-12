import java.util.Collection;
import java.util.Iterator;

public class ForwardingCollection<T> implements Collection<T> {
	private Collection<T> c;

	public ForwardingCollection(Collection<T> c) {
		this.c = c;
	}

	@Override
	public boolean equals(Object obj) {
		return c.equals(obj);
	}

	@Override
	public boolean add(T e) {
		return c.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO: just hardcoded false for now
		return false;
	}

	@Override
	public void clear() {
		c.clear();
	}

	@Override
	public boolean contains(Object o) {
		return c.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return c.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return c.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		return c.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return c.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return c.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return c.retainAll(c);
	}

	@Override
	public int size() {
		return c.size();
	}

	@Override
	public Object[] toArray() {
		return c.toArray();
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		return c.toArray(a);
	}
}
