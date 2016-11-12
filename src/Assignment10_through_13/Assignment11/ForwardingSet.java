import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<T> implements Set<T> {
	private Set<T> set;

	public ForwardingSet(Set<T> set) {
		this.set = set;
	}

	@Override
	public boolean equals(Object obj) {
		return set.equals(obj);
	}

	@Override
	public boolean add(T e) {
		return set.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return set.addAll(c);
	}

	@Override
	public void clear() {
		 set.clear();
	}

	@Override
	public boolean contains(Object o) {
		return set.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return set.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		return set.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return set.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return set.retainAll(c);
	}

	@Override
	public int size() {
		return set.size();
	}

	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	@Override
	public <T> T[] toArray(T[] a) {
		return  (T[]) set.toArray();
	}

}
