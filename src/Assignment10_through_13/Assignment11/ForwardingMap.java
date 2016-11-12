import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ForwardingMap<T1, T2> implements Map<T1, T2> {
	private Map<T1, T2> map;

	public ForwardingMap(Map<T1, T2> map) {
		this.map = map;
	}

	@Override
	public boolean equals(Object obj) {
		return map.equals(obj);
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	@Override
	public Set<java.util.Map.Entry<T1, T2>> entrySet() {
		return map.entrySet();
	}

	@Override
	public T2 get(Object key) {
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}
	
	@Override
	public Set<T1> keySet() {
		return map.keySet();
	}

	@Override
	public T2 put(T1 key, T2 value) {
		return map.put(key, value);
	}

	@Override
	public void putAll(Map<? extends T1, ? extends T2> m) {
		map.putAll(m);
	}

	@Override
	public T2 remove(Object key) {
		return map.remove(key);
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public Collection<T2> values() {
		return map.values();
	}

}
