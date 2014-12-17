
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
	
	public ReturnObject add(int index, Object item) {		// TO BE TESTED
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			ReturnObject wrap = get(index);
			if(wrap.hasError()) {
				return wrap;
			} else {
				wrap = new ReturnObjectImpl(item, ErrorMessage.NO_ERROR);
				ArrayList temp = new ArrayList();
				temp.list = new Object[this.size()+1];
				temp.list[index] = item;
				for(int i=0; i<index; i++) {
					temp.list[i] = this.list[i];
				}
				for(int i=index+1; i<temp.size(); i++) {
					temp.list[i] = this.list[i-1];
				}
				this.list = temp.list;
				return wrap;
			}
		}
	}
	
	public ReturnObject add(Object item) {		// TO BE TESTED
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(item, ErrorMessage.NO_ERROR);
			if(isEmpty()) {
				list = new Object[1];
				list[1] = item;
			} else {
				ArrayList temp = new ArrayList();
				temp.list = new Object[this.size()+1];
				temp.list[temp.size()-1] = item;
				for(int i=0; i<this.size(); i++) {
					temp.list[i] = this.list[i];
				}
				this.list = temp.list;
			}
			return wrap;
		}
	}
	
}


	