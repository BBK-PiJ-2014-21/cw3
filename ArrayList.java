
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

	public ReturnObject get(int index) {
		if(isEmpty()) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.EMPTY_STRUCTURE);
			return wrap;
		} else if(index<0 || index>size()-1) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(list[index], ErrorMessage.NO_ERROR);
			return wrap;
		}
	}
	
	public ReturnObject remove(int index) {
		ReturnObject wrap = get(index);
		if(wrap.hasError()) {
			return wrap;
		} else if(size()==1) {
			list = null;
			return wrap;
		} else {
			return null;	// TO BE IMPLEMENTED
		}
	}
	
	public ReturnObject add(int index, Object item) {		// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject add(Object item) {		// TO BE IMPLEMENTED
		return null;
	}
	
}


	