import java.util.Map;

public class InstrumentedMap<T1, T2> extends ForwardingMap<T1, T2> {
	public InstrumentedMap(Map<T1, T2> map){
		super(map);
	}
}
