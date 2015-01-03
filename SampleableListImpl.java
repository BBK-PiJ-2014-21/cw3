
public class SampleableListImpl implements SampleableList {
	private List list;
	
	public SampleableListImpl(List l) {
		list = l;
	}
	
	public SampleableList sample() {
		SampleableList s = new SampleableListImpl(list);
		for(int i=1; i<s.size(); i++) {
			s.remove(i);
		}
		return s;
	}
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public int size() {
		return list.size();
	}
	
	@Override
	public ReturnObject get(int index) {
		return list.get(index);
	}
	
	@Override
	public ReturnObject remove(int index) {
		return list.remove(index);
	}
	
	@Override
	public ReturnObject add(int index, Object item) {
		return list.add(index, item);
	}
	
	@Override
	public ReturnObject add(Object item) {
		return list.add(item);
	}
	
}