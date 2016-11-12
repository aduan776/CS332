import java.util.List;

public class InstrumentedList<T> extends ForwardingList<T> {
	public InstrumentedList(List<T> list) {
		super(list);
	}
}
