import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ListMapCollectionEqualsTests {

	Map<Integer, Integer> map; 
	Set<Integer> set;
	List<Integer> list;
	
	@Before
	public void setupCollections() {
		map = new HashMap<Integer, Integer>();
		map.put(5, 7);
		set = new HashSet<Integer>();
		set.add(100);
		list = new ArrayList<Integer>();
		list.add(50);
	}

	@Test
	public void equalsSymmetryHoldsForListWrapperAndLists() {
		List<Integer> c = new InstrumentedList<Integer>(list);
		assertEquals(true, c.equals(list));
		assertEquals(true, list.equals(c));
	}

	@Test
	public void equalsTransitivityHoldsForListWrapperAndLists() {
		List<Integer> c = new InstrumentedList<Integer>(list);
		List<Integer> d = new InstrumentedList<Integer>(list);
		assertEquals(true, c.equals(list));
		assertEquals(true, list.equals(d));
		assertEquals(true, c.equals(d));
	}

	@Test
	public void equalsSymmetryHoldsForMapWrapperAndMaps() {
		Map<Integer, Integer> c = new InstrumentedMap<Integer,Integer>(map);
		assertEquals(true, c.equals(map));
		assertEquals(true, map.equals(c));
	}

	@Test
	public void equalsTransitivityHoldsForMapWrapperAndMaps() {
		Map<Integer, Integer> c = new InstrumentedMap<Integer,Integer>(map);
		Map<Integer, Integer> d = new InstrumentedMap<Integer,Integer>(map);
		assertEquals(true, c.equals(map));
		assertEquals(true, map.equals(d));
		assertEquals(true, c.equals(d));
	}

	@Test
	public void equalsSymmetryHoldsForSetWrapperAndSet() {
		Set<Integer> c = new InstrumentedSet<Integer>(set);
		assertEquals(true, c.equals(set));
		assertEquals(true, set.equals(c));
	}

	@Test
	public void equalsTransitivityHoldsForSetWrapperAndSets() {
		Set<Integer> c = new InstrumentedSet<Integer>(set);
		Set<Integer> d = new InstrumentedSet<Integer>(set);
		assertEquals(true, c.equals(set));
		assertEquals(true, set.equals(d));
		assertEquals(true, c.equals(d));
	}

	@Test
	public void equalsSymmetryFailsForCollectionWrapperAndSets() {
		Collection<Integer> c = new InstrumentedCollection<Integer>(set);
		assertEquals(true, c.equals(set));
		assertEquals(false, set.equals(c));
	}

	@Test
	public void equalsSymmetryFailsForCollectionWrapperAndMaps() {
		//Map is a part of the Collection framework, but has a different root from singly tuple collections like lists
	}

	@Test
	public void equalsSymmetryFailsForCollectionWrapperAndLists() {
		Collection<Integer> c = new InstrumentedCollection<Integer>(list);
		assertEquals(true, c.equals(list));
		assertEquals(false, list.equals(c));
	}
}
