
public class ArrayList implements List {
	private Object[] list;
	
	public ArrayList() {
		list = null;
	}
	
	public boolean isEmpty() {
		if(list==null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		if(list==null) {
			return 0;
		} else {
			return list.length;
		}
	}

	public ReturnObject get(int index) {		// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject remove(int index) {		// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject add(int index, Object item) {		// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject add(Object item) {		// TO BE IMPLEMENTED
		return null;
	}
	
}


	