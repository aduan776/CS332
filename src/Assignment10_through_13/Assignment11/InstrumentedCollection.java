import java.util.Collection;

public class InstrumentedCollection<T> extends ForwardingCollection<T> {

	public InstrumentedCollection(Collection<T> c){
		super(c);
	}
}
