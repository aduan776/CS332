import java.util.Set;

public class InstrumentedSet<T> extends ForwardingSet<T> {
	public InstrumentedSet(Set<T> set) {
		super(set);
	}
}
